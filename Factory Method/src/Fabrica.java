
public abstract class Fabrica {
	
	public String nome, nac, sexo;
    public int idade;

}

class Masculino extends Fabrica{
    
    public Masculino(String nome,String sexo, String nac, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.nac = nac;
        this.idade = idade;
        
        System.out.println("Ola senhor " + this.nome);
        System.out.println("sexo " + this.sexo);
        System.out.println("Nacionalidade " + this.nac);
        System.out.println("idade " + this.idade);
    }
}

    class Feminino extends Fabrica{
        public Feminino(String nome, String sexo, String nac, int idade){
            
            this.nome = nome;
            this.sexo = sexo;
            this.nac = nac;
            this.idade = idade;
            
            System.out.println("Ola senhora " + this.nome);
            System.out.println("Sexo " + this.sexo);
            System.out.println("Nacionalidade " + this.nac);
            System.out.println("idade " + this.idade);
        }
    }

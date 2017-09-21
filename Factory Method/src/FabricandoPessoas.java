
public class FabricandoPessoas {
	
	public Fabrica getPessoa(String nome,String sexo, String nac ,int idade){
	    
        if (sexo.equals("Masc")) {
            return new Masculino(nome,sexo,nac,idade);
        }
        
        if (sexo.equals("Femi")){
            return new Feminino (nome,sexo,nac,idade);
        }
        
        return null;
    }

}

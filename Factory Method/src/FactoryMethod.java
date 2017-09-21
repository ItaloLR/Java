
public class FactoryMethod {
	
	 public static void main(String[] args) {
	        
	        FabricandoPessoas p1 = new FabricandoPessoas();
	        
	        String nome = "Salamandra";
	        String sexo = "Femi";
	        String nac = "Brasileira";
	        int idade = 19;
	        
	        p1.getPessoa(nome,sexo,nac,idade);
	        
	    }
}

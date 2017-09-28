
public class TesteBancoDeDados {
	
	public static void main(String[] args) {
		Contato contato1 = new Contato();
		contato1.setNome("Teste 1");
		
		Contato contato2 = new Contato();
		contato1.setNome("Teste 1");
		
		Contato contato3 = new Contato();
		contato1.setNome("Teste 1");
		
		BancoDeDadosFake.getInstance().add(contato1);
		BancoDeDadosFake.getInstance().add(contato2);
		BancoDeDadosFake.getInstance().add(contato3);

		for(Contato c:BancoDeDadosFake.getInstance()){
			System.out.println("O Nome do contato é"+
								c.getNome());
		}
	}


}

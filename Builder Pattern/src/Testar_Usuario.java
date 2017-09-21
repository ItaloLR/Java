
public class Testar_Usuario {
	
	public Usuario getUsuario(){
		return new Usuario.UsuarioBuilder("Italo","Lima").endereco("Rua Messias Augusto da Silva").estado("São Paulo").pais("Brasil").build();	
		
	}
	public static void main (String[] args){
		Testar_Usuario tUsuario = new Testar_Usuario();
		System.out.println(tUsuario.getUsuario().toString());
	}

}

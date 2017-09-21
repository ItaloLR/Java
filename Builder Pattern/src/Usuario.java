//Código feito por Italo Lima RIbeiro, RA:2216109648
//Lucas Santos, RA:
//Italo Bonfim, RA:

public class Usuario {
	
	//atributos obrigatorios
  private String nome;
   private String sobrenome;
    //atributos opcionais
   private String endereco;
   private String estado;
   private String pais;
   
   public Usuario(UsuarioBuilder usuarioBuilder){
	   this.nome = usuarioBuilder.nome;
	   this.sobrenome = usuarioBuilder.sobrenome;
	   this.endereco = usuarioBuilder.endereco;
	   this.estado = usuarioBuilder.estado;
	   this.pais = usuarioBuilder.pais;
   }
   
   public String getNome(){
	   return nome;
  }
   public String getSobrenome(){
	   return sobrenome;
  }
   public String getEndereco(){
	   return endereco;
  }
   public String getEstado(){
	   return estado;
  }
   public String getPais(){
	   return pais;
  }
   
   public String toString(){
	   return "Usuario [nome=" + nome +", sobrenome=" + sobrenome+ ", endereco="+endereco + ", estado="+estado +", pais="+pais + "]";
   }
   
   public static class UsuarioBuilder{
	   
	   private String nome;
	   private String sobrenome;
	   private String endereco;
	   private String estado;
	   private String pais;
	   
	   public UsuarioBuilder(String nome, String sobrenome) {
		   this.nome = nome;
		   this.sobrenome = sobrenome;
	   }
	   public UsuarioBuilder endereco(String endereco){
		   this.endereco = endereco;
		   return this;		   
	   }
	   public UsuarioBuilder estado(String estado){
		   this.estado = estado;
		   return this;
	   }
	   public UsuarioBuilder pais(String pais) {
		   this.pais = pais;
		   return this;
	   }
	   
	   public Usuario build(){
		   return new Usuario(this);
	   }
	   
	   
   }
}   
	

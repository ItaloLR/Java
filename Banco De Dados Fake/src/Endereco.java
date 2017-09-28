
public class Endereco {
	
	private String rua;
	private String bairro;
	private String cidade;
	private int cep;
	private int numeroCasa;
	
	public Endereco(String rua,
					String bairro,
					String cidade,
					int cep,
					int numeroCasa){
		this.rua = rua;
		this.bairro= bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.numeroCasa = numeroCasa;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

}

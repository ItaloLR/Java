
import java.util.List;

public class Contato {
	
	private String nome;
	private String sobreNome;
	private int idade;
	private String rg;
	private Integer cpf;
	private List<Endereco> listaDeEndereco;

	public Contato(){
		
	}
	
	public Contato(String nome, String sobreNome, int idade, String rg, Integer cpf, List<Endereco> listaDeEndereco) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
		this.listaDeEndereco = listaDeEndereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public List<Endereco> getListaDeEndereco() {
		return listaDeEndereco;
	}

	public void setListaDeEndereco(List<Endereco> listaDeEndereco) {
		this.listaDeEndereco = listaDeEndereco;
	}


}

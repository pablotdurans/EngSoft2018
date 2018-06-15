package processos.model;

public class Departamento {
	
	private Integer id;
	private String nome;
	private String sigla;

	private Integer gerarId() {
		return null;
	}
	
	public static Departamento buscarPorNome(String nome) {
		return null;
	}
	
	public static Departamento buscarPorSigla(String sigla) {
		return null;
	}
	
	public static Departamento buscarPorId(Integer id) {
		return null;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public void salvar() {
		
	}
	
	public void excluir() {
		
	}

}

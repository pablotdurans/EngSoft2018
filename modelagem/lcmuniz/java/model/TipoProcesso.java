package processos.model;

public class TipoProcesso {

	private Integer id;
	private String nome;
	
	private Integer gerarId() {
		return null;
	}
	
	public static TipoProcesso buscarPorNome(String nome) {
		return null;
	}
	
	public static TipoProcesso buscarPorId(Integer id) {
		return null;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void salvar() {
		
	}
	
	public void excluir() {
		
	}
	
}

package processos.model;

public class TipoMovimentacao {

	private Integer id;
	private String nome;
	
	private Integer gerarId() {
		return null;
	}
	
	public static TipoMovimentacao buscarPorNome(String nome) {
		return null;
	}
	
	public static TipoMovimentacao buscarPorId(Integer id) {
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

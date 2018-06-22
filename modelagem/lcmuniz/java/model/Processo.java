package processos.model;

import java.util.Collection;

public class Processo {
	
	private Integer id;
	private String numero;
	private Usuario usuario; 
	private String assunto; 
	private TipoProcesso tipoProcesso;
	
	private Integer gerarId() {
		return null;
	}
	
	public static Processo buscarPorNumero(String numero) {
		return null;
	}
	
	public static Processo buscarPorId(Integer id) {
		return null;
	}
	
	public static Collection<Processo> buscarPorusuario(Usuario usuario) {
		return null;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public String getAssunto() {
		return assunto;
	}
	
	public TipoProcesso getTipoProcesso() {
		return tipoProcesso;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	public void setTipoProcesso(TipoProcesso tipoProcesso) {
		this.tipoProcesso = tipoProcesso;
	}
	
	public void salvar() {
		
	}
	
	public void excluir() {
		
	}
	
}

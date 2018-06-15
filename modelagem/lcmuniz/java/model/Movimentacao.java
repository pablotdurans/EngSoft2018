package processos.model;

import java.util.Collection;
import java.util.Date;

public class Movimentacao {
	
	private Integer id;
	private String observacao; 
	private TipoMovimentacao tipoMovimentacao;
	private Processo processo;
	private Date dataHoraInicio;
	private Usuario doUsuario;
	private Date dataHoraFim;
	private Usuario paraUsuario;
	
	private Integer gerarId() {
		return null;
	}
	
	public static Movimentacao buscarPorId() {
		return null;
	}
	
	public static Collection<Movimentacao> buscarPorProcesso(Processo processo) {
		return null;
	}
	
	public static Collection<Movimentacao> buscarAbertas(Usuario usuario) {
		return null;
	}
	
	public static Collection<Movimentacao> buscarAbertasPorProcesso(Processo processo) {
		return null;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}
	
	public Processo getProcesso() {
		return processo;
	}
	
	public Date getDataHoraInicio() {
		return dataHoraInicio;
	}
	
	public Usuario getDoUsuario() {
		return doUsuario;
	}
	
	public Date getDataHoraFim() {
		return dataHoraFim;
	}
	
	public Usuario getParaUsuario() {
		return paraUsuario;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
	
	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	
	public void setDataHoraInicio(Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}
	
	public void setDoUsuario(Usuario doUsuario) {
		this.doUsuario = doUsuario;
	}
	
	public void setDataHoraFim(Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
	
	public void setParaUsuario(Usuario paraUsuario) {
		this.paraUsuario = paraUsuario;
	}
	
	public void salvar() {
		
	}
	
	public void excluir()	{
		
	}

}

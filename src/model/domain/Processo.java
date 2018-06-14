package seap.testeDEV.model.domain;

public class Processo {

    private Integer id;
    private String numero;
    private String assunto;
    private Usuario usuario;
    private TipoProcesso tipoProcesso;

    public Processo(Integer id, String numero, String assunto, Usuario usuario, TipoProcesso tipoProcesso) {
        this.id = id;
        this.numero = numero;
        this.assunto = assunto;
        this.usuario = usuario;
        this.tipoProcesso = tipoProcesso;
    }

    public Processo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoProcesso getTipoProcesso() {
        return tipoProcesso;
    }

    public void setTipoProcesso(TipoProcesso tipoProcesso) {
        this.tipoProcesso = tipoProcesso;
    }
}

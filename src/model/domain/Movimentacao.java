package seap.testeDEV.model.domain;

import java.util.Date;

public class Movimentacao {

    private Integer id;
    private String observacao;
    private Date dataInicio;
    private Date dataFim;
    private Usuario doUsuario;
    private Usuario paraUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Usuario getDoUsuario() {
        return doUsuario;
    }

    public void setDoUsuario(Usuario doUsuario) {
        this.doUsuario = doUsuario;
    }

    public Usuario getParaUsuario() {
        return paraUsuario;
    }

    public void setParaUsuario(Usuario paraUsuario) {
        this.paraUsuario = paraUsuario;
    }
}

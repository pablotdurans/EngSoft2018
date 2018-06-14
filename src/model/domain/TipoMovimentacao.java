package seap.testeDEV.model.domain;

public class TipoMovimentacao {

    private Integer id;
    private Integer nome;

    public TipoMovimentacao(Integer id, Integer nome) {
        this.id = id;
        this.nome = nome;
    }

    public TipoMovimentacao() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNome() {
        return nome;
    }

    public void setNome(Integer nome) {
        this.nome = nome;
    }
}

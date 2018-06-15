package seap.testeDEV.model.domain;

public class Funcionario {

    private Integer id;
    private String nome;
    private String cpf;
    private Departamento departamento;

    public Funcionario(Integer id, String nome, String cpf, Departamento departamento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
    }

    public Funcionario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}

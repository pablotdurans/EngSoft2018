package processos.model;

import java.util.Collection;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private String cpf;
	private Departamento departamento;
	
	private Integer gerarId() {
		return null;
	}
	
	public static Funcionario buscarPorNome(String nome) {
		return null;
	}
	
	public static Funcionario buscarPorCpf(String cpf) {
		return null;
	}
	
	public static Funcionario buscarPorId(Integer id) {
		return null;
	}
	
	public static Collection<Funcionario> buscarPorDepartamento(Departamento departamento) {
		return null;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public void salvar() {
		
	}
	
	public void excluir() {
		
	}
	
}

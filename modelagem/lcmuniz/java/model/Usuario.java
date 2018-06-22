package processos.model;

import java.util.Collection;

public class Usuario {
	
	private Integer id;
	private String cpf;
	private String nome;
	private String email;
	private String senha;
	private TipoUsuario tipoUsuario;
	private Funcionario funcionario;
	
	private Integer gerarId() {
		return null;
	}
	
	public static Usuario sortearUsuario(Collection<Usuario> usuarios) {
		return null;
	}
	
	public static Usuario buscarPorId(Integer id) {
		return null;
	}
	
	public static Usuario buscarPorEmail(String email) {
		return null;
	}
	
	public static Usuario buscarPorEmailESenha(String email, String senha) {
		return null;
	}
	
	public static Usuario buscarPorFuncionario(Funcionario funcionario) {
		return null;
	}
	
	public static Collection<Usuario> buscarPorTipoUsuario(TipoUsuario tipoUsuario) {
		return null;
	}
	
	public static Collection<Usuario> buscarPorDepartamento(Departamento departamento) {
		return null;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome= nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public void salvar() {
		
	}
	
	public void excluir() {
		
	}
	
	public void cadastrarProcesso_UC() {
		
	}
	
	public void concluirProcesso_UC() {
		
	}
	
	public void movimentarProcesso_UC() {
		
	}
	
	public void visualizarProcesso_UC() {
		
	}
	
	public void login_UC() {
		
	}
	
	public void logout_UC() {
		
	}

}

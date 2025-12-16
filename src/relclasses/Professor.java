package relclasses;

public class Professor {
	private String matricula;
	private String nome;
	private Departamento departamento;
	private String titulacao;
	private String regimeTrabalho;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public String getRegimeTrabalho() {
		return regimeTrabalho;
	}
	public void setRegimeTrabalho(String regimeTrabalho) {
		this.regimeTrabalho = regimeTrabalho;
	}
	
	@Override
	public String toString() {
		return "\nProfessor\n\n" + "Matricula: " +  matricula + "\nNome: " + nome + "\nDepartamento: " + departamento
				+ "\nTitulação: " + titulacao + "\nRegime de Trabalho: " + regimeTrabalho;
	}
	
	
}

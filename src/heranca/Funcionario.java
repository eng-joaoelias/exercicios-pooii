package heranca;

public class Funcionario {
	private String nome;
	private double salario;
	private String matricula;
	private String departamento;
	private String dataAdmissao;
	
	public String exibirDetalhes() {
		return "\nNome: " + nome + "\nSalario: R$" + salario + "\nMatrícula: " + matricula + "\nDepartamento: "
				+ departamento + "\nData de admissao: " + dataAdmissao;
	}

	public Funcionario(String nome, double salario, String matricula, String departamento, String dataAdmissao) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.matricula = matricula;
		this.departamento = departamento;
		this.dataAdmissao = dataAdmissao;
	}
	
	public double calcularSalario() {
		return this.getSalario();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	
}

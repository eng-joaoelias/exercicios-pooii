package heranca;

public class Gerente extends Funcionario {
	
	private double gratificacao;
	
	public Gerente(String nome, double salario, String matricula, String departamento, String dataAdmissao) {
		super(nome, salario, matricula, departamento, dataAdmissao);
	}
	
	//Aumento percentual do salário do gerente de acordo com a gratificação percentual
	@Override
	public double calcularSalario() {
		this.setSalario(super.getSalario()*(1 + this.getGratificacao()/100));
		return this.getSalario();
	}

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
	
	
}

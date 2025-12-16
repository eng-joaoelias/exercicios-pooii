package heranca;

public class Aluno extends Pessoa {
	
	private String matricula;

	public Aluno(String nome, String dataNascimento, String matricula) {
		super(nome, dataNascimento);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return super.toString() + "\nMatricula: " + this.getMatricula();
	}
	
	

}

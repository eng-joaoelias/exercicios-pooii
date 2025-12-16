package interfaces;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private double nota;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
    @Override
	public int compareTo(Aluno outroAluno) {
        return Double.compare(outroAluno.getNota(), this.getNota());
    }
	
}

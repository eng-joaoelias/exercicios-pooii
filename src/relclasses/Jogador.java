package relclasses;

public class Jogador {
	private String matricula;
	private String nome;
	private String posicao;
	private int numCamisa;
	private Time time;
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
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public int getNumCamisa() {
		return numCamisa;
	}
	public void setNumCamisa(int numCamisa) {
		this.numCamisa = numCamisa;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "\nJogador\n\n" + matricula + "\nNome: " + nome + "\nPosicao: " + posicao + "\nNumero da camisa: "
				+ numCamisa + "\nTime:\n" + time;
	}
	
	
}

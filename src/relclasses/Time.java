package relclasses;

import java.util.ArrayList;

public class Time {
	private String nome;
	private String sigla;
	private String cidade;
	private ArrayList <Jogador> listaJogadores;
	
	public Time(String nome, String sigla, String cidade) {
        this.nome = nome;
        this.sigla = sigla;
        this.cidade = cidade;
        this.listaJogadores = new ArrayList<>(); // Inicialização crucial da lista
    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public ArrayList<Jogador> getListaJogadores() {
		return listaJogadores;
	}
	public void setListaJogadores(ArrayList<Jogador> listaJogadores) {
		this.listaJogadores = listaJogadores;
	}
	
	public boolean adicionarJogador(Jogador jog) {
		
		if(this.getListaJogadores().contains(jog)) {
			return false;
		} else {
			this.getListaJogadores().add(jog);
			return true;
		}
		
	}
	
	public boolean removerJogador(Jogador jog) {
		
		if(this.getListaJogadores().contains(jog)) {
			this.getListaJogadores().remove(jog);
			return true;
		} else {
			return false;
		}
		
	}
	
	public Jogador buscarJogador(Jogador jog) {
		
		if(this.getListaJogadores().contains(jog)) {
			return this.getListaJogadores().get(getListaJogadores().indexOf(jog));
		} else {
			return null;
		}
		
	}
	
	public int contarJogadores() {
		return this.getListaJogadores().size();
	}
}

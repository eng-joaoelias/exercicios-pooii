package relclasses;

import java.util.ArrayList;

public class Departamento {
	private String nome;
	private String sigla;
	private ArrayList<Professor> listaProfessores; 
	
	public Departamento(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        this.listaProfessores = new ArrayList<>();
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
	
	public ArrayList<Professor> getListaProfessores() {
		return listaProfessores;
	}

	public boolean adicionarProfessor(Professor prof) {
		
		if(this.getListaProfessores().contains(prof)) {
			return false;
		} else {
			this.getListaProfessores().add(prof);
			return true;
		}
		
	}
	
	public boolean removerProfessor(Professor prof) {
		
		if(this.getListaProfessores().contains(prof)) {
			this.getListaProfessores().remove(prof);
			return true;
		} else {
			return false;
		}
		
	}
	
	public Professor buscarProfessor(Professor prof) {
		
		if(this.getListaProfessores().contains(prof)) {
			return this.getListaProfessores().get(getListaProfessores().indexOf(prof));
		} else {
			return null;
		}
		
	}
	
	public int contarProfessores() {
		return this.getListaProfessores().size();
	}
	
}

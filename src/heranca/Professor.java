package heranca;

import java.util.regex.Pattern;

public class Professor extends Pessoa {

	private String titulacao;

	public Professor(String nome, String dataNascimento, String titulacao) {
		super(nome, dataNascimento);
		this.titulacao = titulacao;
		this.aplicarPrefixoTitulacao();
	}

	private void aplicarPrefixoTitulacao() {
		String prefixo = "";

		// Verifica a titulação (ignorando maiúsculas/minúsculas)
		if (this.titulacao != null) {
			if (Pattern.compile(Pattern.quote("doutorado"), Pattern.CASE_INSENSITIVE).matcher(this.titulacao).find()) {
				prefixo = "Dr. ";
			} else if (Pattern.compile(Pattern.quote("mestrado"), Pattern.CASE_INSENSITIVE).matcher(this.titulacao)
					.find()) {
				prefixo = "Msc. ";
			}
		}

		// Aplica o prefixo apenas se ainda não tiver sido aplicado
		if (!super.getNome().startsWith(prefixo) && !prefixo.isEmpty()) {
			super.setNome(prefixo + super.getNome());
		}
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTitulacao: " + this.getTitulacao();
	}

}

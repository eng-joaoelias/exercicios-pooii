package excecao;

/*
 * Crie uma classe de exceção personalizada SaldoInsuficienteException
 * que estenda Exception. Crie uma classe ContaBancaria com um método
 * sacar(double valor) que lança SaldoInsuficienteException se o saldo
 * for insuficiente.
 */

public class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
}

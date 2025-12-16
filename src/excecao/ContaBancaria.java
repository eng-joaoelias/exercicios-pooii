package excecao;

public class ContaBancaria {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double sacar(double valor) throws SaldoInsuficienteException {
		
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
		} else {
			throw new SaldoInsuficienteException("Impossível sacar! Saque maior que o saldo disponível");
		}
		return this.getSaldo();
	}
	
	
}

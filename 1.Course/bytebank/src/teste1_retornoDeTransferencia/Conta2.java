package teste1_retornoDeTransferencia;

public class Conta2 {
	double saldo;
	int agencia;
	int numero;
	String titular;

	void depositar(double valor) {
//		this.saldo = this.saldo + valor;
		this.saldo += valor;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
//			this.saldo = this.saldo - valor;
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double valor, Conta2 destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}

}

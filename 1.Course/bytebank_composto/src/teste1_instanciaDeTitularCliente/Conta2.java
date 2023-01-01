package teste1_instanciaDeTitularCliente;

public class Conta2 {
	double saldo;
	int agencia;
	int numero;
	Cliente2 titular;

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

package bytebank_herdado_conta;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean sacar(double valor) {
		double valorSacar = valor + 0.2;
		return super.sacar(valorSacar);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo = 0.001;
	}
}

package bytebank_herdado_conta;

public class TestaContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(9064, 12345);
		cc.depositar(100);

		ContaPoupanca cp = new ContaPoupanca(9065, 12352);
		cp.depositar(200.0);

		cc.transferir(10.0, cp);
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());

		cc.sacar(100);
		System.out.println("Saldo da conta corrente: " + cc.getSaldo());
	}
}

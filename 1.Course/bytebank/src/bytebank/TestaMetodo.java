package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		System.out.println("Testando Metodo");
		Conta conta = new Conta();
		conta.saldo = 300;
		System.out.println("Saldo da conta: " + conta.saldo);
		conta.depositar(50);
		System.out.println("Saldo da conta com depoisto: " + conta.saldo);

		conta.sacar(30);
		System.out.println("Saldo da conta apos deposito: " + conta.saldo);
	}
}

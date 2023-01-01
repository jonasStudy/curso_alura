package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.saldo = 200;
		conta2.saldo = 400;

		System.out.println("Saldo da conta 1: " + conta1.saldo);
		System.out.println("Saldo da conta 2: " + conta2.saldo);
	}
}

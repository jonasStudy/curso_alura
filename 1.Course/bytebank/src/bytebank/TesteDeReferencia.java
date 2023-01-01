package bytebank;

public class TesteDeReferencia {
	public static void main(String[] args) {
		System.out.println("Referencia VS Objeto");
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("Posicao do armazenamento da primeira conta: " + primeiraConta);
			System.out.println("Posicao do armazenamento da segunda conta: " + segundaConta);
			System.out.println("Sao as mesmas contas!");
		}
	}
}

package exercicios;

public class TestaReferencia2 {
	public static void main(String[] args) {
		System.out.println("Testando Referencia 2");
		ClassConta primeiraConta = new ClassConta();
		primeiraConta.agencia = 123;
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		System.out.println("Agencia da primeira conta: " + primeiraConta.agencia + "\r\n");
		ClassConta segundaConta = new ClassConta();
		segundaConta.agencia = 123;
		segundaConta.saldo = 300;
		System.out.println("Agencia da segunda conta: " + segundaConta.agencia);
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo + "\r\n");

		if (primeiraConta == segundaConta) {
			System.out.println("As contas sao iguais");
		} else {
			System.out.println("As contas nao sao iguais");
		}
		System.out.println();

		System.out.println("Armazenamento conta 1: " + primeiraConta);
		System.out.println("Armazenamento conta 2: " + segundaConta);
	}
}

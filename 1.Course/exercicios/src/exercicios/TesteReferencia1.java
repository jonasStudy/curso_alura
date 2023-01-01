package exercicios;

public class TesteReferencia1 {
	public static void main(String[] args) {
		System.out.println("Teste de Referencia 1");
		ClassConta primeiraConta = new ClassConta();
		
		primeiraConta.saldo = 300; 
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		ClassConta segundaConta = new ClassConta();
		
		segundaConta.saldo = 400; 
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		System.out.println();
		
		System.out.println("Armazenamento primeira conta: " + primeiraConta);
		System.out.println("Armazenamento segunda conta: " + segundaConta);
		
	}
}

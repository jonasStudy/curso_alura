package bytebank_encapsulado;

public class TestaConstrutor {
	public static void main(String[] args) {
		Conta conta1 = new Conta(30, 123);
		Conta conta2 = new Conta(30, 123);
		Conta conta3 = new Conta(30, 123);
		
		System.out.println("Total de contas criadas: " + Conta.getTotal());
	}
}

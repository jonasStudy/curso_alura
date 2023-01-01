package teste1_retornoDeTransferencia;

public class RetornoTransferencia {
	public static void main(String[] args) {

		Conta2 conta1 = new Conta2();
		Conta2 conta2 = new Conta2();

		conta1.saldo = 200;
		conta2.saldo = 400;

		System.out.println("Saldo da conta 1: " + conta1.saldo);
		System.out.println("Saldo da conta 2: " + conta2.saldo);

//		teste 1: validando o retorno boolean do metodo  

		if (conta1.transferir(100, conta2)) {
			System.out.println("Transferencia realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
			System.out.println();
		}

//		teste 2: outra forma de validar o retorno boolean
		
		boolean resultadoTransferencia = conta1.transferir(4000, conta2);
		if (resultadoTransferencia) {
			System.out.println("Transferencia realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
}

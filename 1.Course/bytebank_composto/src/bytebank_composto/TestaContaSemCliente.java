package bytebank_composto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDoJonas = new Conta();

		System.out.println("O que tem dentro de titular: " + contaDoJonas.titular);
		
//		Cliente nao instanciado 
		contaDoJonas.titular.nome = "Jonas Borges";
		System.out.println(contaDoJonas.titular.nome);
	}
}

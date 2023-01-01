package teste1_instanciaDeTitularCliente;

public class TestaBanco {
	public static void main(String[] args) {

		Cliente2 cliente = new Cliente2();
		cliente.nome = "Jonas Borges";
		cliente.cpf = "111.111.111-11";
		cliente.profissao = "Programador";

		Conta2 contaDoJonas = new Conta2();
		contaDoJonas.titular = cliente;

		System.out.println("Titular da primeira conta: " + contaDoJonas.titular.nome
				+ "\r\n");
		
		System.out.println("Verificando os locais armazenados na memoria:");
		
		System.out.println(cliente);
		System.out.println(contaDoJonas.titular);
	}
}

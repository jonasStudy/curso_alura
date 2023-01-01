package bytebank_herdado;

public class TestaInterface {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Administrador adm = new Administrador();
		Cliente cliente = new Cliente();

		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(gerente);
		sistema.autentica(adm);
		sistema.autentica(cliente);
	}
}

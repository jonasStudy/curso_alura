package bytebank_herdado;

public class TestaSistema {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
//		gerente.setSenha(2222);

		Administrador adm = new Administrador();
		adm.setSenha(123345);

//		Designer designer = new Designer();

		SistemaInterno sistema = new SistemaInterno();
//		sistema.autentica(gerente);
//		sistema.autentica(adm);
	}
}

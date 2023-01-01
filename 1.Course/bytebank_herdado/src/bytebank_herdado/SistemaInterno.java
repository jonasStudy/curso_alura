package bytebank_herdado;

public class SistemaInterno {
	private int senha = 2222;

	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autenticar(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Nao pode entrar no sistema!");
		}
	}
}
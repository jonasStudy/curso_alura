package bytebank_herdado;

public class Cliente implements Autenticavel {

	private AutenticaSenha autenticador;

	public Cliente() {
		this.autenticador = new AutenticaSenha();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autenticar(int senha) {
		return this.autenticador.autentica(senha);
	}
}

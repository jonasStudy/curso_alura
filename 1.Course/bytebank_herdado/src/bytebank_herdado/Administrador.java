package bytebank_herdado;

public class Administrador extends Funcionario implements Autenticavel {

	private AutenticaSenha autenticador;

	public Administrador() {
		this.autenticador = new AutenticaSenha();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autenticar(int senha) {
		return this.autenticar(senha);
	}

	@Override
	public double getBonificacao() {
		return 50;
	}
}

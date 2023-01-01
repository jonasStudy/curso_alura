package bytebank_herdado;

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticaSenha autenticador;

	public Gerente() {
		this.autenticador = new AutenticaSenha();
	}

	public double getBonificacao() {
		System.out.println("Bonificacao do Gerente");
		return super.getSalario();
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
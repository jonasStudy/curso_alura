package bytebank_herdado;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario gerente = new Gerente();
		gerente.setSalario(2000);
		Funcionario editor = new EditorVideo();
		editor.setSalario(4000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(editor);

		System.out.println("Total de bonificacao: " + controle.getSoma());
	}
}

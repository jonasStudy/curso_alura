package bytebank_herdado;

public class TestaReferenciaBonificacao {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Jonas Gerente");
		gerente.setSalario(3000);
		
		EditorVideo editor = new EditorVideo();
		editor.setNome("Jonas Editor");
		editor.setSalario(5000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(editor);
		System.out.println("Soma bonificacao: " + controle.getSoma());
	}
}

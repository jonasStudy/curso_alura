package bytebank_herdado_conta;

public class TestaTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(6064, 123456);
		cc.depositar(1000);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.registra(seguro);
		calculador.registra(cc);
		
		System.out.println(calculador.getTotalImposto());
	}
}

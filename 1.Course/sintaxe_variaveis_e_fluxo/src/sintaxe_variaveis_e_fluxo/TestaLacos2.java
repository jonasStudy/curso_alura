package sintaxe_variaveis_e_fluxo;

public class TestaLacos2 {
	public static void main(String[] args) {
		System.out.println("Testando Laco 2");
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
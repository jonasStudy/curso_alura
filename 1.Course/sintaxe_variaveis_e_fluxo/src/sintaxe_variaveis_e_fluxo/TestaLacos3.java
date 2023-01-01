package sintaxe_variaveis_e_fluxo;

public class TestaLacos3 {
	public static void main(String[] args) {
		System.out.println("Testa Laco 3");
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna <= linha; coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

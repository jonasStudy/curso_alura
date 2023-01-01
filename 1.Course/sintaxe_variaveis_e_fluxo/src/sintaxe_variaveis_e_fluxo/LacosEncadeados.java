package sintaxe_variaveis_e_fluxo;

public class LacosEncadeados {
	public static void main(String[] args) {
		System.out.println("Testando Lacos Encadeados");
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int contador = 0; contador <= 10; contador++) {
//				System.out.println(multiplicador * contador);
				System.out.print(multiplicador * contador);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

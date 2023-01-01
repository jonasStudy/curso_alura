package sintaxe_variaveis_e_fluxo;

public class TestaSomatoria {
	public static void main(String[] args) {
		System.out.println("Testa somatoria");
		int contador = 0;
		int total = 0;

		while (contador <= 10) {
			// total = total + contador;
			total += contador;
			System.out.println(total);
			contador++;
		}
		// System.out.println(total);
	}
}

package exercicios;

public class MultiplosAteCem {
	public static void main(String[] args) {
		System.out.println("Identificando os Multiplos ate o 100");

		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}

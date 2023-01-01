package exercicios;

public class LacoAninhado1 {
	public static void main(String[] args) {
		System.out.println("Laco Aninhado 1");

		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna ++) {
				if (coluna > linha) {
					break;
				}
				System.out.print(coluna + 1);
			}
			System.out.println();
		}
	}
}

//1
//12
//123
//1234
//12345
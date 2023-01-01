package exercicios;

public class TesteWhile1 {
	public static void main(String[] args) {
		System.out.println("Testando Laco While - Primeiro Teste");

		int contador = 0;

		while (contador <= 15) {
			System.out.println("Contando: " + contador);
			if (contador == 3) {
				break;
			} else {
				contador++;
			}
		}
		System.out.println("Valor atual do contador: " + contador);
		System.out.println();
	}
}

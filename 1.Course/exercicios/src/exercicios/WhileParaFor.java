package exercicios;

public class WhileParaFor {
	public static void main(String[] args) {
		System.out.println("Mudando o Laco do While para For");

		int contador = 0;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("Modificando o codigo para for...");
		for (int contadorFor = 0; contadorFor <= 10; contadorFor++) {
			System.out.println(contadorFor);
		}
	}
}

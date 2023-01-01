package exercicios;

public class ErroDeCompilacao {
	public static void main(String[] args) {
		System.out.println("Erro de Compilacao" + "\r\n");

		String enunciado = "Clarice, amiga de Fernando percebeu que ele esta com dificuldade "
				+ "na implementacao de um loop feito com while. Seu objetivo e imprimir no "
				+ "console os numeros de 1 a 10. No entanto, o codigo nao compilava.";

		System.out.println(enunciado);

//		while (contador <= 10) {
//			int contador = 1;
//			System.out.println(contador);
//			contador++;
//		}

		int contador = 1;
		while (contador <= 10) {
			System.out.println("Contando de 1 ate 10: " + contador);
//			contador = contador + 1;
//			contador += 1;
//			++contador;
			contador++;
		}
	}
}

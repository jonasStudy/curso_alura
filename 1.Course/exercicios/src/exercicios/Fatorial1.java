package exercicios;

public class Fatorial1 {
	public static void main(String[] args) {
		System.out.println("Testando Fatorial");
		int fatorial = 1;
		for (int i = 1; i < 11; i++) {
//			fatorial = fatorial * i;
			fatorial *= i;
			System.out.println("Fatorial de: " + i + " e " + fatorial);
		}

	}
}

//Enunciado: 
//	1 - criar uma classe 
//	2 - escrever um for 
//	3 - iniciar uma variavel com o numero 1 (nomeada fatorial)
//	4 - fazer o laco entre 1 e 10

//Exemplo de fatorial: 
//O fatorial de 4 = 1 x 2 x 3 x 4 = 24
//O fatorial de 5 = 1 x 2 x 3 x 4 x 5 = 720
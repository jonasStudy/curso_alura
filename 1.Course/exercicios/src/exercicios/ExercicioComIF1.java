package exercicios;

public class ExercicioComIF1 {
	public static void main(String[] args) {
		System.out.println("Exercicio com IF - 1");

		String enunciado = "O Joao gostaria de criar um Programa sobre Imposto de Renda (IR)"
				+ "e verificou as seguintes regras: "
				+ "-> de 1900.00 ate 2800.0, o IR e de ate 7.5% e pode deduzir na declaracao o valor de 142"
				+ "-> de 2800.01 ate 3751.0, o IR e de 15% e pode deduzir 350"
				+ "-> de 3751.01 ate 4664.00, o IR e de 22.5% e pode deduzir 636" + "\r\n";

		System.out.println("Enunciado: " + enunciado);

		double salario = 3300.00;

		if (salario >= 1900.0 || salario <= 2800.0) {
			System.out.println("O IR e de 7.5%");
			System.out.println("Pode deduzir: R$142");
		} else if (salario >= 2800.01 || salario <= 3751.0) {
			System.out.println("O IR e de 15%");
			System.out.println("Pode deduzir: R$350");
		} else if (salario >= 3751.01 || salario <= 4664.00) {
			System.out.println("O IR e de 22.5%");
			System.out.println("Pode deduzir: R$636");
		}
	}
}

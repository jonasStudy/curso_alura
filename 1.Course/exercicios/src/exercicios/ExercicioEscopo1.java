package exercicios;

public class ExercicioEscopo1 {
	public static void main(String[] args) {
		System.out.println("Treinando Escopo");
		
		String enunciado = "Desta vez Joao fez uma implementacao para calcular o salario "
				+ "em caso de promocao. Ele fez a seguinte implementacao:";
		System.out.println(enunciado);
		
		boolean foiPromovido = true; 
		
		if (foiPromovido) {
			//double salario = 4200.0;
		}else {
			//double salario = 3800.0;
		}
		
		// Sera que vai compilar? A resposta e nao. Nao ira compilar pois a variavel "salario" esta fora do escopo da menssagem
		
		//System.out.println("Salario do funcionario: " + salario);
		
	}
}

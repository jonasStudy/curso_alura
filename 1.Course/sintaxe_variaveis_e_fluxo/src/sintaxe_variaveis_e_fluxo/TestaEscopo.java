package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando Escopo");

		//int idade = 18;
		int quantidadePessoas = 1;
		// boolean acompanhado = quantidadePessoas >= 2;

		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		// Este bloco else nao poderia ser removido embora saibamos que ha apenas uma possibilidade
		// O compilador ira entender que quando ha a possibilidade da variavel nao ter sido instanciada ele nao vai deixar que ela seja instanciada. Esta informacao pode estar vindo do banco de dados por exemplo. Entao, para o "acompanhado" abaixo nao iria funcionar 
		
		System.out.println("Valor de acompanhado: " + acompanhado);
	}
}

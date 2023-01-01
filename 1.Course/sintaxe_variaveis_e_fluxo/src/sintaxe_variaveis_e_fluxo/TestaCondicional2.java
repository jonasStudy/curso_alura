package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais 2");
		int idade = 16;
		int acompanhadoPessoas = 1;
		
		if (idade >= 18 || acompanhadoPessoas >= 2) {
			System.out.println("Voce pode entrar!");
		}else {
			System.out.println("Voce nao pode entrar!");
		}
	}
}

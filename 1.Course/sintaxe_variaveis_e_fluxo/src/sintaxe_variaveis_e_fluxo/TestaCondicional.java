package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais" + "\r\n");
		
		int idade = 10;
		int acompanhadoPessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Voce pode entrar");
			System.out.println("Seja bem vindo");
		} else {
			if (acompanhadoPessoas >= 2) {
				System.out.println("Voce pode entrar, pois esta acompanhado");
			} else {
				System.out.println("Voce nao pode entrar!");
			}
		}
	}
}

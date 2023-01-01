package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String texto = "Trabalhando com valores de texto";
		System.out.println(texto);
		
		texto = texto + " " + 2022;
		System.out.println(texto);
	}
}

package sintaxe_variaveis_e_fluxo;

public class TestaValores {
	public static void main(String[] args) {
		System.out.println("Testando valores");
		int primeiro = 5;
		int segundo = 10;
		
		primeiro = segundo; 
		System.out.println(primeiro);
		
		segundo = 12;
		System.out.println(primeiro);
		System.out.println(segundo);
	}
}

public class Exercicio3{

	public static void main(String args[]){
		System.out.println(intParaBinario(25, ""));
		System.out.println(intParaBinario(1, ""));
		System.out.println(intParaBinario(100, ""));
		System.out.println(intParaBinario(28, ""));
	}

	static String intParaBinario(int numero, String binario){
		if (numero <= 0)
			return binario;
		return intParaBinario(numero/2, numero%2 + binario );
	}
}
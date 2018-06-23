public class Exercicio4{
	public static void main(String[] args){
		int numeros[] = crivo(30000);
		for( int p = 0; p < numeros.length; p++){
			if(numeros[p] != 0)
				System.out.println( numeros[p] +  " ");
		}
	}
	static int[] crivo(int N){
		int[] numeros = new int[N+2];
		int[] primos =  new int[N+2];
		for (int i = 0; i< numeros.length ; i++ ) {
			numeros[i] = i;
		}
		//marcaremos como 0 as posições que são numeros primos
		//começando de v[2];
		for (int i = 2;i < numeros.length ; i++) {
			if (numeros[i] != 0){
				primos[i] = numeros[i];
			}
			//marcar os multiplos de v[i] com 0
			for (int j = i; j < numeros.length ; j += i ) {
				numeros[j] = 0;
			}

		}
		return primos;
	}
}
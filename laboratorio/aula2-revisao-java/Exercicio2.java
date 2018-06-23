public class Exercicio2{
	public static void main(String[] args){
		int[] vetor = {1,2,3,4,99,5,6,7,8,9,0};
		//vetor antes
		imprimeVetor(vetor);
		System.out.println(insereVetor(vetor, 66, 5));
		imprimeVetor(vetor);		
	}
	public static boolean insereVetor(int vetor[], int numero, int posicao){
		if(vetor[posicao] == 0){
			vetor[posicao] = numero;
			return true;
		}

		for (int i = 0; i < vetor.length; i++){
			if (i > posicao && vetor[i] == 0 ){
				//é possivel mover o vetor
				int j = i;
				int aux;
				while((j) > posicao){
					aux = vetor[j];
					vetor[j] = vetor[j-1];
					vetor[j-1] = aux;
					j--;
				}
				vetor[posicao] = numero;
				return true;	
			}
		}

		//chegou aqui => vetor cheio
		return false;
	}
	public static void imprimeVetor(int[] vetor){
		for (int elemento : vetor){
			System.out.print(elemento + " ");
		}System.out.println();
	}
}	

// 1 2 0 3 4 5 6
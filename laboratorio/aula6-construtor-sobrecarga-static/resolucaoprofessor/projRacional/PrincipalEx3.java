import racional.*;

public class PrincipalEx3 {

	public static void main(String[] args) {
		try {
			// Testando a matriz
			MatrizRacional m1 = new MatrizRacional(3, 5);
			m1.imprimir(); System.out.println();
			MatrizRacional m2 = new MatrizRacional(3, 5);
			m2.imprimir(); System.out.println();
			m1.soma(m2);
			m1.imprimir(); System.out.println();
			
			MatrizRacional[] matrizes = new MatrizRacional[3];
			for (int i = 0; i < matrizes.length; i++) {
				matrizes[i] = new MatrizRacional();
				matrizes[i].imprimir(); System.out.println();
			}
		} catch(Exception e) {
			System.out.println("Erro: " + e.toString());
		}
	}

}
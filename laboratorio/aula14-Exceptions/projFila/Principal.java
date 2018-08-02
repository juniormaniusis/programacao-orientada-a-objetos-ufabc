import estrutura.*;
public class Principal {
	public static void main(String[] args){
		
		System.out.println("- - - TESTE 01 - - -");

		FilaAprimorada fila = new FilaAprimorada(3);
		/*
		fila.enfileira("obj 1");
		fila.enfileira("obj 2");

		System.out.println(fila.desenfileira());
		System.out.println(fila.desenfileira());
		//System.out.println(fila.desenfileira());
		//OK
		*/

		System.out.println("- - - TESTE 02 - - -");

		FilaAprimorada fila2 = new FilaAprimorada(3);
		
		fila2.enfileira("obj 1");
		fila2.enfileira("obj 2");
		//fila2.enfileira("obj 3");

		System.out.println("- - - TESTE 03 - - -");
		
		try (FilaRecurso filaR = new FilaRecurso(3)) {
			filaR.enfileira("obj 1");
			filaR.enfileira("obj 2");
		}

	}
}
import planodeensino.*;

public class Principal {
	public static void main(String[] args) {
		//cria um plano de ensino 
		PlanoDeEnsino plano1 = new PlanoDeEnsino(4); // ->tem limite de 3 aulas

		//cria algumas aulas.

		Aula aula1 = new Teorica("Introdução");
		Aula aula2 = new Pratica("Revisão de Java");
		Aula aula3 = new Prova("P1", 0.5);
		Aula aula4 = new Teorica("Polimorfismo");
		Aula aula5 = new Prova("P2", 0.5);
		
		try {
			plano1.adicionarAula(aula1);
			plano1.adicionarAula(aula2);
			plano1.adicionarAula(aula3);
			plano1.adicionarAula(aula4);
			plano1.adicionarAula(aula5);			
		} catch(MuitasAulas e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e.toString());
		}

		plano1.imprimir();

		System.out.println("Formula = " + plano1.getFormula());
		
		
	}

}
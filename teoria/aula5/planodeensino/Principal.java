
public class Principal{
  public static void main(String args[]){
    //cria uma aula avulsa
    Aula aula1 = new Aula("Apresentação da Disciplina");
    Aula aula2 = new Aula("Limites");

    PlanoDeEnsino plano1 = new PlanoDeEnsino(3, "Funções de uma varável");
    PlanoDeEnsino plano2 = new PlanoDeEnsino(3);
    System.out.println(plano1);
    System.out.println(plano2);

    plano1.adicionarAula(aula1);
    plano1.adicionarAula(aula2);
    plano1.adicionarAula("Funções Contínuas");

    plano2.adicionarAula(aula1);
    plano2.adicionarAula(aula2);
    plano2.adicionarAula("Funções Contínuas");

    System.out.println(plano1);
    System.out.println(plano2);
    System.out.println("----imprindo planos de ensino---");
    plano1.imprimir();
    plano2.imprimir();



  }

}

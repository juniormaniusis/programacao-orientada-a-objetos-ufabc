class Main {
  public static void main(String[] args) {

    //Cria algumas perguntas para serem adicionadas na prova

    String enunciado1 = "2+2 = X";

    Alternativa alt1 = new Alternativa( "X = 4");
    Alternativa alt2 = new Alternativa( "X = 3");
    Alternativa alt3 = new Alternativa( "X = 0");

    Pergunta q1 = new Pergunta(enunciado1, alt1, alt2, alt3);

    String enunciado2 = "O que vale mais?";
    Alternativa alt21 = new Alternativa("1kg de cebola.");
    Alternativa alt22 = new Alternativa("1kg de tomate.");
    Alternativa alt23 = new Alternativa("Reprovadoooooooooooo!");

    Pergunta q2 = new Pergunta(enunciado2, alt21, alt22, alt23);

    Pergunta q3 = new Pergunta("Numa festa de rodeio: ",
            "Não pode ficar parado.");

    //cria uma prova com as questoes criadas anteriormente e as imprime
    Prova P1 = new Prova(q1, q2, q3);
    P1.imprimir();

    Prova P2 = P1.clone();
    P2.imprimir();

    q3.setEnunciado("mundando o enunciado da questao 3");

    P1.imprimir();
    P2.imprimir();

    //como a copia é profunda, só foi alterada a questão 3 da primeira prova.

  }
}

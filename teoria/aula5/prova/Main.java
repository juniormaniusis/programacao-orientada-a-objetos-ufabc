class Main {
  public static void main(String[] args) {
    /*
    Pergunta p = new Pergunta();
    p.setEnunciado("Quanto é 1 - 3323?");

    Alternativa a, b, c;
    a = new Alternativa("200.");
    b = new Alternativa("321.");
    c = new Alternativa("123.");

    p.adicionarAlternativa(a);
    p.adicionarAlternativa(b);
    p.adicionarAlternativa(c);
    p.adicionarAlternativa(new Alternativa("Num ssei vei."));
    */

    Alternativa a = new Alternativa("1");
    Alternativa[] as = {a, new Alternativa("2"), new Alternativa("500")};
    Pergunta p = new Pergunta("Quanto é 2+2?", as);
    p.imprimirPergunta();

    //pergunta 2

    Pergunta q = new Pergunta("O que vale mais?", "Um kilo de cebola.", "Um kilo de tomate.", "Não sei.", "Reprovadoooooooooooooooooooooooooooooo.");
    q.imprimirPergunta();
  /*  for (int i = 0; i < 10; i++)
      System.out.println("r = "+ Math.ceil(Math.random()*20-1));
  }/*/
System.out.println("PPPPPPPPPPP");
    p.imprimirPergunta(1);
    System.out.println("QQQQQQQQQQQQ");
    q.imprimirPergunta(1);
  }
}

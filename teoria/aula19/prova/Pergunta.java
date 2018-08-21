/*
Esta classe armazena um vetor de alternativas e também armazena um String,
que é o enunciado das alternativas.
*/

public class Pergunta implements Cloneable{
  //atributos
  private Alternativa[] alternativas = new Alternativa[4];
  private String enunciado;

  //contrutores
  public Pergunta(String enunciado, Alternativa... alternativas){
    setEnunciado(enunciado);
    for (Alternativa alternativa : alternativas){
      adicionarAlternativa(alternativa);
    }
  }

  public Pergunta(String enunciado, String... alternativas){
    setEnunciado(enunciado);
    for (String alternativa : alternativas){
      adicionarAlternativa(alternativa);
    }
  }

  //getters e setters
  public void setEnunciado(String enunciado){
    this.enunciado = enunciado;
  }

  public String getEnunciado(){
    return this.enunciado;
  }

  public int getQtdAlternativas(){
    return this.alternativas.length;
  }

  //outros métodos
  public void adicionarAlternativa(Alternativa novaAlternativa){
    //procura uma alternativa que está vazia e coloca a nova alternativa

    for ( int i = 0; i < alternativas.length; i++){
      if (alternativas[i] == null){
        alternativas[i] = novaAlternativa;
        return;
      }
    }
    System.out.println("Erro, não há espaço para mais alternativas.");
  }

  public void adicionarAlternativa(String novaAlternativa){
    for ( int i = 0; i < alternativas.length; i++){
      if (alternativas[i] == null){
        alternativas[i] = new Alternativa(novaAlternativa);
        return;
      }
    }
      System.out.println("Erro, essa questão já possui 3 alternativas");
  }

  public void imprimirPergunta(){
    System.out.println("Pergunta: " + enunciado);
    for (Alternativa elemento : alternativas){
      if(elemento != null){
        System.out.println("( ) " + elemento.getTexto());
      } else {
        System.out.println("(alternativa com referencia nula)");
      }

    }
  }

  public void imprimirPergunta(int random){
    int qtdAlternativas = this.getQtdAlternativas();
    boolean[] perguntasImpressas = new boolean[qtdAlternativas];
    int r = 0;
    for(int i = 0; i < qtdAlternativas; i++){
      r = (int) Math.round(Math.random()*getQtdAlternativas()-2.0);
      if ( perguntasImpressas[r] == false){
        System.out.println("( ) " + alternativas[r].getTexto());
        qtdAlternativas--;
        perguntasImpressas[r] = true;
      }
    }
  }

  @Override
  public Pergunta clone() {
    try {
      Pergunta pClone = (Pergunta) super.clone();
      pClone.alternativas = this.alternativas.clone();
      for (int i = 0; i < this.alternativas.length; i++) {
        if (this.alternativas[i] != null)
          pClone.alternativas[i] = this.alternativas[i].clone();
      }
      return pClone;
    } catch(Exception e) {
      System.out.println("Erro ao clonar a pergunta >" + e);
    }
    return null;
  }
}

public class Pergunta{
  
  private Alternativa[] alternativas = new Alternativa[4];
  private String enunciado;

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


  public void setEnunciado(String enunciado){
    this.enunciado = enunciado;
  }
  public String getEnunciado(){
    return this.enunciado;
  }

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
      if(elemento != null)
        System.out.println("( ) " + elemento.getTexto());
    }
  }

}
public class Prova implements Cloneable{
    Pergunta perguntas[];

    //Pode-se adicionar qualquer quantidade de perguntas
    public Prova(Pergunta... perguntas){
      this.perguntas = perguntas;
    }

    public void imprimir() {
      System.out.println("______________________ PROVA ______________________");
      //retorna caso a prova estiver vazia

      if (perguntas == null)  {
        System.out.println("A prova não possui nenhuma questão.");
        return;
      }

      //imprime as perguntas
      for (int i = 0; i < this.perguntas.length; i++) {

        if (this.perguntas[i] != null)
          this.perguntas[i].imprimirPergunta();
        else {
          System.out.println(this.perguntas[i]);
        }
        System.out.println();
      }

    }

    public void deletarPerguntas() {
      perguntas = null;
    }

    public Prova clone() {
      try {
        Prova clonada = (Prova) super.clone();
        clonada.perguntas = this.perguntas.clone();

        for (int i = 0; i < this.perguntas.length; i++) {
          if (this.perguntas[i] != null){
            clonada.perguntas[i] = this.perguntas[i].clone();
            clonada.perguntas[i].imprimirPergunta();
          }


        }
        return clonada;
      }catch(Exception e) {
        System.out.println(e);
      }
      return null;
    }
}

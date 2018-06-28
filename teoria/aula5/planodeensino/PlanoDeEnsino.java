
public class PlanoDeEnsino{
  private Aula[] aulas;
  private String nomeDisciplina;
  private int indiceAulaLivre;
  private static int  qtdPlanoDeEnsino;


  //contrutores
  public PlanoDeEnsino(int qtdAulas){
    aulas = new Aula[qtdAulas];
    indiceAulaLivre = 0;
    setQtdPlanoDeEnsino(getQtdPlanoDeEnsino() + 1);
    setNomeDisciplina("Plano de Ensino Sem Título " + getQtdPlanoDeEnsino());
  }
  public PlanoDeEnsino(int qtdAulas, String nomeDisciplina){
    aulas = new Aula[qtdAulas];
    indiceAulaLivre = 0;
    this.setNomeDisciplina(nomeDisciplina);
  }

    //getters e setters
  public void setNomeDisciplina(String nomeDisciplina){
    this.nomeDisciplina = nomeDisciplina;
  }
  public String getNomeDisciplina(){
    return this.nomeDisciplina;
  }
  public int getQtdAulas(){
    return this.aulas.length;
  }
  public int getIndiceAulaLivre(){
    return this.indiceAulaLivre;
  }
  public void setIndiceAulaLivre(int novoIndice){
    this.indiceAulaLivre = novoIndice;
  }
  public static int getQtdPlanoDeEnsino(){
    return PlanoDeEnsino.qtdPlanoDeEnsino;
  }
  private static void setQtdPlanoDeEnsino(int novaQtd){
    PlanoDeEnsino.qtdPlanoDeEnsino = novaQtd;
  }
  private Aula getAula(int indice){
      return this.aulas[indice];
  }

//outros métodos
  public void adicionarAula(Aula novaAula){
    //verifica se é possível adicionar uma aula.
    if (this.getIndiceAulaLivre() < this.getQtdAulas()) {
      aulas[this.getIndiceAulaLivre()] = novaAula;
      qtdPlanoDeEnsino++;
      setIndiceAulaLivre(getIndiceAulaLivre() +1);
    } else {
      //lançar exception TODO
    }
    return;
  }
  public void adicionarAula(String titulo){
    //verifica se é possível adicionar uma aula.
    if (this.getIndiceAulaLivre() < this.getQtdAulas()) {
      aulas[this.getIndiceAulaLivre()] = new Aula(titulo);
      qtdPlanoDeEnsino++;
      setIndiceAulaLivre(getIndiceAulaLivre() +1);
    } else {
      //lançar exception TODO
    }
    return;
  }
  public String toString(){
    return ("[" + ( this.getIndiceAulaLivre() ) + "/" + getQtdAulas()+"] "
                  +  this.getNomeDisciplina());
  }
  public void imprimir(){
    //imprime o nome da disciplina e (aulas ocupadas / aulas livres)
    System.out.println(this.getNomeDisciplina() + "["+this.getIndiceAulaLivre()+"/"+
                                          this.getQtdAulas()+"]");
    //imprime as aulas detalhadamente
    for(int i = 0; i < this.getIndiceAulaLivre(); i++){
      System.out.println("["+i+"]-" + this.getAula(i) );
    }
  }
}

package numeroracional;

public  class MatrizRacional{
  private NumeroRacional[][] matriz;
  private static int tamanhoProximaMatriz = 3;
  //toda vez que criarmos uma matriz, a proxima deverá ser criada
  //com um tamanho maior, ex: 1 vez = 3x3; 2 vez = 4x4.

  public MatrizRacional() {
    this(tamanhoProximaMatriz, tamanhoProximaMatriz);
    tamanhoProximaMatriz++;
  }
  public MatrizRacional(int l, int c) {
    matriz = new NumeroRacional[l][c];
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < c ; j++) {
        matriz[i][j] = new NumeroRacional();
      }
    }
  }
  public void imprimir(){
    for ( NumeroRacional[] linha : matriz ) {
      for ( NumeroRacional elemento : linha ) {
        System.out.print(elemento.getString() + " ");
      }
      System.out.println();
    }
    //pular uma linha ao final, por questoes de embelezamento, apenas.
    System.out.println();
  }
  public void somar(MatrizRacional parcela) throws Exception {
    //verifica se o tamanho das matrizes são compativeis
    if (parcela.matriz.length != this.matriz.length
        && parcela.matriz[0].length != this.matriz.length) {
      throw new Exception("Erro ao tentar somar matrizes!\nMatrizes com tamanhos incompatíveis");
    }
    for (int i = 0; i < this.matriz.length ; i++ ) {
      for (int j = 0; j < this.matriz[i].length ; j++ )  {
        this.matriz[i][j].somar(parcela.matriz[i][j]);
      }

    }

  }
}

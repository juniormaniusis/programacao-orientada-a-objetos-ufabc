package loteria;
public class NumeroLoteria{
  private int[] numeros;
  //contrutor
  public NumeroLoteria(){
    // construtor default
    numeros = new int[3];
    NumeroAleatorio random = new NumeroAleatorio();
    for (int i = 0; i < numeros.length ;i++ ) {
      this.numeros[i] = random.getNumeroAleatorio();
    }
  }
  public NumeroLoteria(int[] numeros) throws Exception{
      //usa os numeros do parametro ao inves de numeros aleatorios
      //lançar exception caso o vetor passado como parametro tenha mais de 3 numeros
      if (numeros.length > 3){
        throw new  Exception("Vetor tem comprimeto maior que 3.");
      }
      this.numeros = new int[3];
      for (int i = 0; i < this.numeros.length ; i++ ) {
        this.numeros[i] =numeros[i];
      }
  }
  public String getNumeros(){
    String num = "";
    for (int numero : numeros ) {
      num += numero+" ";
    }
    return num;
  }
  public boolean ganhou(NumeroLoteria nLoteria){
    boolean numeroCerto = false;
    for (int i = 0; i < this.numeros.length; i++){
      for (int j = 0; j < nLoteria.numeros.length; j++){
        if (this.numeros[i] ==nLoteria.numeros[j]){
          numeroCerto = true;
        }
      }
      if (!numeroCerto){
        return false;
      }
      numeroCerto = false;
    }
    return true;
  }
}

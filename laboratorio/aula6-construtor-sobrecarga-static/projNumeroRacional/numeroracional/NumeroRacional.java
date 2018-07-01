package numeroracional;

public class NumeroRacional{
  private int numerador;
  private int denominador;
  //os números devem ser armazenados em sua forma simplificada
  //por exemplo: 8/2 deve ser guardado como 4/1, 8/4 como 1/2.

  //CONTRUTORES
  public NumeroRacional(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
    this.simplificar();
  }
  public NumeroRacional() {
    NumeroAleatorio numero = new NumeroAleatorio();
    this.numerador = numero.getNumeroAleatorio();
    do{
      this.denominador = numero.getNumeroAleatorio();
    }while(this.denominador == 0);

    this.simplificar();
  }

  private void simplificar() {
    //transforma a fração em sua forma simplificada para ser armazenada adequadamente.
    int mdc = this.getMDC();
    this.numerador = this.numerador / mdc;
    this.denominador = this.denominador / mdc;
    return;
  }
  private int getMDC() {
    //como achar o maximo divisor comum?
    int mdc = 1;
    int i = 1;
    //procurar 1 divisor que seja menor ou igual o numerador OU menor igual ao denominador
    while( i <= this.numerador   && i  <= this.denominador){
      if ((this.numerador % i == 0) && (this.denominador % i == 0)){
        //se i divide a e b então ele é candidato a ser o MDC.
        mdc = i;
      }
      i++;
    }
    return mdc;
  }
  public int getNumerador() {
    return this.numerador;
  }
  public int getDenominador() {
    return this.denominador;
  }
  public void somar(NumeroRacional parcela) {
    //soma o numero racional com outro.
    int denominadorSoma = parcela.getDenominador() * this.getDenominador();
    int numeradorSoma =  this.getDenominador() * parcela.getNumerador()
                                            +  parcela.getDenominador() * this.getNumerador();
    this.denominador = denominadorSoma;
    this.numerador = numeradorSoma;
    this.simplificar();
  }
  public String getString() {
    return this.numerador + "/" + this.denominador;
  }

}

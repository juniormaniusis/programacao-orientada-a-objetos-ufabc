package pctbanco;
class Conta{
  private int id = 0;
  private double saldo;

  public void setId(int id){
    this.id = id;
  }
  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  public int getId(){
    return this.id;
  }
  public double getSaldo(){
    return this.saldo;
  }

  public void imprimirSaldo(){
    System.out.printf("ID(%d): Saldo = R$%.02f.%n",
     this.getId(), this.getSaldo());

  }

}

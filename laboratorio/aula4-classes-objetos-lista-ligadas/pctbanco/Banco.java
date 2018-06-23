package pctbanco;
public class Banco{
  Conta contas[] = new Conta[10];

  public void iniciar(){
    for (int i = 0; i < 10 ; i++) {
      contas[i] = new Conta();
    }
  }

  //recebe como argumento o deposito inicial e retorna o id da nova conta
  public int abrirConta(double depositoInicial){
    //procura um ID livre, conta 1 id = 1; conta 2 id = 2 .. conta N id = N;
    for (int i = 0; i < contas.length; i++){
      if (contas[i].getId() == 0){
          //encontrou um Id disponível
          contas[i].setId(i+1);
          contas[i].setSaldo(depositoInicial);
          contas[i].imprimirSaldo();
          return i+1;
      }
    }
    //se chegou aqui não há ID disponível.
    return -1;
  }

  //recebe o id da conta e um valor como argumento, valor negativo = saque
  //deve imprimir um erro caso a conta fique negativa
  public void transacao(int id, double valor){
    //verificar se a operação é saque e se é possível sacar dinheiro
      if ((contas[id].getSaldo() + valor) < 0){
        System.out.printf("Não há saldo suficiente.%n");
        return;
      }
      contas[id].setSaldo(contas[id].getSaldo() + valor);
  }

  //recebe como argumento o id de uma conta e imprime o saldo atual
  public void saldo(int id){
    contas[id-1].imprimirSaldo();
  }
}

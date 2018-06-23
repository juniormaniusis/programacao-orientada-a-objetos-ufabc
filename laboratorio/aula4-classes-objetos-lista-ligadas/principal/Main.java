package principal;

import listaligada.*;
import pctbanco.*;
import universidade.*;
import principal.*;

public class Main{
  public static void main(String[] args) {
      //cria uma lista ligada e preenche ela com valores crescentes
      ListaLigada L = new ListaLigada();

      for (int i = 0; i < 4 ;i++ ) {
        L.adicionar(i);
      }
      //imprime a lista, remove alguns elementos e imprime
      L.print();
      L.remover(0);
      L.remover(1);
      L.print();
      L.remover(2);
      L.remover(3);
      L.print();

      //testes da classe Pessoa
      Pessoa p1 = new Pessoa();
      p1.setCpf("123.123.123-2");
      /*
      //testes da classe Conta
      Conta conta1 = new Conta();
      conta1.setId(1);
      conta1.setSaldo(200.24);
      conta1.imprimirSaldo();

      Conta conta2 = new Conta();
      conta2.setId(222);
      conta2.setSaldo(333345.12);
      conta2.imprimirSaldo();
      */

      //teste da classe Banco
      Banco bank = new Banco();
      bank.iniciar();//aloca as contas do banco na memória.
      for (int i = 0; i < 10 ; i++) {
        bank.abrirConta(i*100);
      }
      bank.saldo(1);

  }
}

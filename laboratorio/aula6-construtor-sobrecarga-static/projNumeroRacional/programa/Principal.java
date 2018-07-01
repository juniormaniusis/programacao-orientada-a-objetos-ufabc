package programa;
import numeroracional.*;
public class Principal{
  public static void main(String[] args){

    NumeroRacional numero1 = new NumeroRacional(1,2);
    System.out.println("Numero 1: " + numero1.getString());

    NumeroRacional numero2 = new NumeroRacional(1,2);
    System.out.println("Numero 2: " + numero2.getString());

    NumeroRacional numero3 = new NumeroRacional(20,4);
    System.out.println("Numero 3: " + numero3.getString());

    //soma de numero1 com numero2
    System.out.print(numero1.getString() + " + "+ numero2.getString() + "  =  ");
    numero1.somar(numero2);
    System.out.println(numero1.getString());
  }
}

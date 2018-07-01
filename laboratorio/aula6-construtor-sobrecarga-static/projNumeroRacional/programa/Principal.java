package programa;
import numeroracional.*;
public class Principal{
  public static void main(String[] args){
    System.out.println("Operacoes com numeros racionais:  ");
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

    //cria uma matriz de racionais
    MatrizRacional m = new MatrizRacional(3, 3);
    MatrizRacional m2 = new MatrizRacional(3, 3);
    System.out.println("Primeira matriz: ");
    m.imprimir();
    System.out.println("Segunda matriz: ");
    m2.imprimir();
    System.out.println("Somando a primeira matriz com a segunda...");
    try {
      m.somar(m2);
      System.out.println("Resultado: ");
      m.imprimir();
    } catch(Exception e) {
      System.out.println(e);
    }

    //cria matrizes aleatorias
    System.out.println("Matriz Aleatoria 1: ");
    MatrizRacional a1 = new MatrizRacional();
    a1.imprimir();
    System.out.println("Matriz Aleatoria 2: ");
    MatrizRacional a2 = new MatrizRacional();
    a2.imprimir();
    System.out.println("Matriz Aleatoria 3: ");
    MatrizRacional a3 = new MatrizRacional();
    a3.imprimir();

    try {
      a3.somar(a2);
      System.out.println("Resultado: ");
      a3.imprimir();
    } catch(Exception e) {
      System.out.println(e);
    }

  }
}

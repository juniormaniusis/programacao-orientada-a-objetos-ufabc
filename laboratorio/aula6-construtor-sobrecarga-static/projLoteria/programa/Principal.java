package programa;
import loteria.*;
public class Principal{
  public static void main(String[] args){
    System.out.println("---------------------------LOTERIA----------------------------------");

    try {
      NumeroLoteria n1 = new NumeroLoteria();
      System.out.println("Numeros aleátorio: " + n1.getNumeros());

      int[] meusNumeros = {1, 2, 3};
      NumeroLoteria n2 = new NumeroLoteria(meusNumeros);
      System.out.println("Meus números: " + n2.getNumeros());

      int[] numerosVencedores = {3, 1, 2};
      System.out.print("Numeros vencedores: " );
      for (int num : numerosVencedores ) {
          System.out.print(num + " " );
      }
      System.out.println();

      System.out.println("---------------------------------------------------------------------------");

      System.out.println("Numeros aleatorios ganharam? " + n2.ganhou(new NumeroLoteria(numerosVencedores) ) );
      System.out.println("Meus numeros ganharam? " + n2.ganhou(new NumeroLoteria(meusNumeros) ) );

    } catch(Exception e) {
      System.out.println("Erro = "+ e.toString());
    }




  }
}

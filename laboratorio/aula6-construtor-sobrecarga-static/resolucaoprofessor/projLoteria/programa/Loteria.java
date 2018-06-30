package programa;

import loteria.*;
import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        try {
            System.out.println("Quantos sorteios?");
            Scanner leitor = new Scanner(System.in);
            int n = leitor.nextInt();
            
            System.out.println("E ai, qual sequencia?");
            int[] seqUsuario = new int[3];
            for (int i = 0; i < seqUsuario.length; i++)
                seqUsuario[i] = leitor.nextInt();
            NumeroLoteria numDoUsuario = new NumeroLoteria(seqUsuario);

            NumeroLoteria[] sorteios = new NumeroLoteria[n];
            boolean ganhou = false;
            for (int i = 0; i < sorteios.length; i++) {
                sorteios[i] = new NumeroLoteria();
                System.out.println(sorteios[i].getNumeros());
                if (sorteios[i].ganhou(numDoUsuario))
                    ganhou = true;
            }

            System.out.println( ganhou ? "Vc ganhou!" : "Nao ganhou :-)" );
        } catch (Exception e) {
            System.out.println("Deu erro: " + e.toString());
        }
    }

}

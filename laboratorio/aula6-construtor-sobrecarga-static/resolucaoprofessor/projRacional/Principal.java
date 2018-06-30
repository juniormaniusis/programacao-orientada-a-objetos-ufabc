import racional.NumeroRacional;

public class Principal {

    public static void main(String[] args) {
        NumeroRacional n1 = new NumeroRacional(5, 10);
        NumeroRacional n2 = new NumeroRacional();

        System.out.println(n1.getString());
        System.out.println(n2.getString());

        System.out.println();

        NumeroRacional n3 = new NumeroRacional(7, 10);
        NumeroRacional n4 = new NumeroRacional(3, 10);
        System.out.println(n3.getString() + "+" + n4.getString());
        n3.soma(n4);
        System.out.println(n3.getString());

        System.out.println();

        NumeroRacional n5 = new NumeroRacional(7, 5);
        NumeroRacional n6 = new NumeroRacional(3, 10);
        System.out.println(n5.getString() + "+" + n6.getString());
        n5.soma(n6);
        System.out.println(n5.getString());
    }

}

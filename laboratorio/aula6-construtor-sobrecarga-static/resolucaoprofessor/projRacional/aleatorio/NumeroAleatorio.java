package aleatorio;

public class NumeroAleatorio {

    public static int getAleatorio() {
        return (int) Math.round( Math.random() * 10);
    }

}

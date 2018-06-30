package loteria;

public class NumeroLoteria {

    private int[] numeros = new int[3];

    public NumeroLoteria() throws Exception {
        int[] numerosAleatorios = new int[numeros.length];
        for (int i =0; i < numerosAleatorios.length; i++)
            numerosAleatorios[i] = NumeroAleatorio.getAleatorio();

        this.numeros = numerosAleatorios;
    }

    public NumeroLoteria(int[] numeros) throws Exception {
        if (numeros.length != this.numeros.length)
            throw new Exception("Comprimento invalido!");
        
        for (int i = 0; i < numeros.length; i++)
            this.numeros[i] = numeros[i];
    }

    public String getNumeros() {
        String strNumeros = "";
        for (int n : numeros)
            strNumeros += n + " ";
        return strNumeros;
    }

    public boolean ganhou(NumeroLoteria nLoteria) {
        /*return (this.getNumeros().equals(nLoteria.getNumeros()));*/

        for (int i = 0; i < this.numeros.length; i++) {
            if (this.numeros[i] != nLoteria.numeros[i])
                return false;
        }
        return true;
    }

}

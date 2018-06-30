package racional;

public class MatrizRacional {
	private NumeroRacional[][] matriz;
	private static int tamanho = 2;
	
	public MatrizRacional() {
		this(++tamanho, tamanho);
	}
	public MatrizRacional(int x, int y) {
		this.matriz = new NumeroRacional[x][y];
		preencherAleatorio();
	}
	private void preencherAleatorio() {
		for (int x = 0; x < matriz.length; x++)
			for (int y = 0; y < matriz[0].length; y++)
				this.matriz[x][y] = new NumeroRacional();
	}
	public void soma(MatrizRacional m) throws Exception {
		if ((matriz.length != m.matriz.length) && (matriz[0].length != m.matriz[0].length))
			throw new Exception("Tamanhos incompativeis!");
		for (int x = 0; x < m.matriz.length; x++)
			for (int y = 0; y < m.matriz[0].length; y++)
				this.matriz[x][y].soma(m.matriz[x][y]);
	}
	public void imprimir() {
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[0].length; y++)
				System.out.print(matriz[x][y].getString() + " ");
			System.out.println();
		}
	}
}
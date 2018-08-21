package objetos;

public class Notebook extends Eletronico {
	private int numPortasUsb;
	
	public Notebook(String serial, int numPortasUsb) {
		super(serial);
		this.numPortasUsb = numPortasUsb;
	}
	
	
	public int getNumPortasUsb() {
		return this.numPortasUsb;
	}
	
	@Override
	public String toString() {
		return ( super.toString() + "-" + this.getNumPortasUsb() );
	}
}

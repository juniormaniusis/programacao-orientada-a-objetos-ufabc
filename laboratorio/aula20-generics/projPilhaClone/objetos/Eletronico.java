package objetos;

public abstract class Eletronico implements Cloneable {

	private String serial;
	

	
	public Eletronico(String serial) {
		this.serial = serial;
	}
	
	public  String getSerial() {
		return this.serial;
	}
	
	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + " " + this.getSerial();
	}
	
	@Override
	public Eletronico clone() throws CloneNotSupportedException {
		return (Eletronico) super.clone();
	}
	
}

package objetos;

public class NotebookGrande extends Notebook {
	public static int NUM_PORTAS_USB = 25;
	
	public NotebookGrande(String serial) {
		super(serial, NUM_PORTAS_USB);
	}
	
}

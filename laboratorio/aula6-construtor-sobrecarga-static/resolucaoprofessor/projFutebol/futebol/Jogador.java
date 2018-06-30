package futebol;

public class Jogador {
	private String nome, numeroInscricao;
	
	public Jogador(String nome, String numeroInscricao) throws Exception {
		if (!verificaNI(numeroInscricao))
			throw new Exception("NI invalido: " + numeroInscricao);
		
		this.nome = nome;
		this.numeroInscricao = numeroInscricao;
	}
	public Jogador(String nome, int[] numeroInscricao) throws Exception {
		this(nome, converteNIParaString(numeroInscricao));
	}
	private boolean verificaNI(String ni) {
		boolean valido = true;
		if (ni.length() != 14)
			valido = false;
		else {
			for (int i = 0; i < 11 && valido; i++)
				if ((i == 3) || (i == 7)) {
					if (ni.charAt(i) != '.')
						valido = false;
				} else if (i == 11) {
					if (ni.charAt(i) != '-')
						valido = false;
				} else {
					if (!Character.isDigit(ni.charAt(i)))
						valido = false;
				}
		}
		return valido;
	}
	private static String converteNIParaString(int[] numeroInscricao) throws Exception {
		if (numeroInscricao.length != 11)
			throw new Exception("Comprimento invalido! Deveria ser 11!");
		
		String strNI = "";
		for (int i = 0; i < 11; i++) {
			if ((i == 3) || (i == 6)) {
				strNI += ".";
			} else if (i == 9) {
				strNI += "-";
			}
			strNI += numeroInscricao[i];			
		}
		return strNI;
	}
	public String getNome() {
		return this.nome;
	}
	public String getNI() {
		return this.numeroInscricao;
	}
}
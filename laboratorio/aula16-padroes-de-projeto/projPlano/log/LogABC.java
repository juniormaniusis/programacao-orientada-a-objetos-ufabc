package log;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogABC {

	private int sequencia = 0; // Nao altere para static
	private BufferedWriter br;
	private static LogABC logABC;

	private LogABC() throws IOException {
		br = new BufferedWriter(new FileWriter("log.txt"));
	}

	public static LogABC getInstance() {
		if (logABC == null) {
			try{
				logABC = new LogABC();
			}catch(Exception e) {
				System.out.println("Erro ao criar o LogABC");
				System.out.println("ERRO = " + e.toString());
			}
		}
		return logABC;
	}

	public void registrarAcao(String acao) {
		try {
			br.write("[" + ++sequencia + "] " + acao);
			br.newLine();
		} catch (Exception e) {
			System.out.println("Erro ao registrar acao: " + e);
		}
	}

	public void fecharLog() throws IOException {
		br.close();
	}

}

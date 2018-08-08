package autenticacao;
import java.util.Scanner;
public class AutenticacaoPorSenha implements IMetodoAutenticacao {

  @Override
  public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException {
    Scanner teclado = new Scanner(System.in);

    //solicita ao usuario o nome, o código e sua senha.
    System.out.println("Digite o seu nome: ");
    String nome = teclado.next();

    System.out.println("Digite o seu código: ");
    int cod = teclado.nextInt();

    System.out.println("Digite a sua senha: ");
    String senha = teclado.next();


    if (senha.equals("1234")) {
      return new UsuarioAutenticado(cod, nome);
    }

    //caso não consiga fazer login, lançar exception.
    throw new UsuarioNaoAutenticadoException();
    
  }

}

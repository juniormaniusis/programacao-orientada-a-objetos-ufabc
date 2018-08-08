package autenticacao;
import java.util.Scanner;
public class AutenticacaoPorSwipe implements IMetodoAutenticacao {

  Scanner teclado = new Scanner(System.in);

  @Override
  public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException{
    //solicita o nome, senha e código.

    System.out.println("Digite o seu nome: ");
    String nome = teclado.next();

    System.out.println("Digite o seu código: ");
    int cod = teclado.nextInt();

    System.out.println("Desenhe sua senha Swipe (x,y): ");
    System.out.println("  1 2 3");
    System.out.println("1 o o o");
    System.out.println("2 o o o");
    System.out.println("3 o o o");
    String senha = teclado.next();

    if (senha.equals("112233")){
      return new UsuarioAutenticado(cod, nome);
    }

    //caso não tenha conseguido autenticar, lançar exception.
    throw new UsuarioNaoAutenticadoException();

  }

}

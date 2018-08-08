package viking;
public class Remador extends Viking implements AutoCloseable{

  @Override
  public void close() {
    super.close();
    System.out.println("REMADOR!!");
  }
}


package viking;
public class Lider extends Viking implements AutoCloseable{

  @Override
  public void close() {
    super.close();
    System.out.println("LIDER!!");
  }
}

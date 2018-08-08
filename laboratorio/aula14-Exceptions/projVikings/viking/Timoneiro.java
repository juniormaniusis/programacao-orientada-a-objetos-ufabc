package viking;

public class Timoneiro extends Viking implements AutoCloseable{

  @Override
  public void close() {
    super.close();
    System.out.println("TIMONEIRO!!!");
  }

}

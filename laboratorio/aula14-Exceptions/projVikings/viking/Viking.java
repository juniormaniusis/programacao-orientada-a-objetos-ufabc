package viking;

public abstract class Viking implements AutoCloseable{

  @Override
  public void close() {
    System.out.print("“ARRGH” ");
  }

}

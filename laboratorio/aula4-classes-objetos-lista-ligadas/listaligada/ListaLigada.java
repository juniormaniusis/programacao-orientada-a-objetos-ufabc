package listaligada;
//como a classe não é publica, podemos utilizar um nome de classe diferente do
//nome da classe
class LinkedNode{
    int data;
    LinkedNode next;
}
public class ListaLigada{
  LinkedNode head = null;

  //adiciona um elemento `a lista
  public void adicionar(int data){
    if (head == null) {
      head = new LinkedNode();
      head.data = data;
      return;
    }
    LinkedNode node = head;
    while( node.next != null ){
      node = node.next;
    }
    node.next = new LinkedNode();
    node.next.data = data;
  }

  //imprime toda a lista
  public void print(){
      //começa no nó que é a cabeça
      LinkedNode node = head;//auxiliar para percorrer a lista
      while(node != null) {
        System.out.printf("%d ", node.data);
        node = node.next;
      }
      System.out.println();
  }

  public void remover(int data){
    //caso não exista nenhum elemento na lista
    if (head == null){
      return;
    }
    //caso esteja direto na cabeça
    if (head.data == data){
      head = head.next;
      return;
    }
    //nó auxiliar para percorrer a lista
    //olhando no proximo do node
    LinkedNode node = head;
    while(node.next != null && node.next.data != data){
      node = node.next;
    }
    if (node.next != null){
      node.next = node.next.next;
    }
  }

}

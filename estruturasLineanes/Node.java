package estruturasLineanes;

// classe que representa um elemento na lista encadeada
public class Node {
    public int element; // valor armazenado no nodo
    public Node next; // referencia para o proximo nodo na lista

    //construtor para criar um novo nodo com um valor especifico
    public Node(int element) {
        this.element = element;
        this.next = null; //inicialmente o proximo nodo é nulo
    }

    public int getelement() {
        return element;
    }

    public void setelement(int element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

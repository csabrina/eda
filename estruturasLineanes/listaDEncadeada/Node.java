package estruturasLineanes.listaDEncadeada;

public class Node {
    private int element; // valor armazenado no nodo
    private Node next; // referencia para o proximo nodo na lista
    private Node previous; // referencia para o anterior nodo na lista

    public Node(int element) {
        this.element = element;
        this.next = null; //inicialmente o proximo nodo é nulo
        this.previous = null; //inicialmente o anterior nodo é nulo
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

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
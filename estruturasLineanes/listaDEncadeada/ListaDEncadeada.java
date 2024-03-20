package estruturasLineanes.listaDEncadeada;

public class ListaDEncadeada {
    private Node head; //referência para o primeiro nodo da lista
    private Node tail; // referência para o último nodo da lista
    private int count; // contador para o número de elementos na lista

    // construtor para inicializar a lista vazia
    public ListaDEncadeada(int count, Node head, Node tail) {
        this.head = null; // inicialmente, a lista está vazia, então a cabeça é nula
        this.tail = null; // inicialmente, a lista está vazia, então a cauda é nula
        this.count = 0; // inicialmente, a lista não tem elementos
    }

}

package estruturasLineanes;

//classe que representa uma lista simplesmente encadeada
public class ListaSEncadeada {
    private Node head; //referência para o primeiro nodo da lista
    private Node tail; // referência para o último nodo da lista
    private int count; // contador para o número de elementos na lista

    // construtor para inicializar a lista vazia
    public ListaSEncadeada(int count, Node head, Node tail) {
        this.head = null; // inicialmente, a lista está vazia, então a cabeça é nula
        this.tail = null; // inicialmente, a lista está vazia, então a cauda é nula
        this.count = 0; // inicialmente, a lista não tem elementos
    }

    public ListaSEncadeada() {
        //TODO Auto-generated constructor stub
    }

    // método para obter o tamanho da lista
    public int size() {
        return count; // retorna o número de elementos na lista
    }

    // método para adicionar um elemento ao final da lista
    public void add(int element) {
        Node newNode = new Node(element); // cria um novo nodo com o elemento especificado
        if (head == null) { // se a lista estiver vazia
            head = newNode; // o novo nodo se torna a cabeça da lista
        } else { // se a lista já tiver elementos
            tail.next = newNode; // o próximo do último nodo aponta para o novo nodo
        }
        tail = newNode; // atualiza a cauda da lista para o novo nodo
        count++; // incrementa o contador de elementos
    }

    // método para obter o nodo em um determinado índice na lista
    public Node get(int index) {
        if (index < 0 || index >= count) { // verifica se o índice está dentro dos limites da lista
            return null; // retorna nulo se o índice estiver fora dos limites
        }
        Node current = head; // inicia a busca a partir da cabeça da lista
        for (int i = 0; i < index; i++) { // percorre a lista até o índice desejado
            current = current.next; // avança para o próximo nodo
        }
        return current; // retorna o nodo encontrado
    }

    // método para adicionar um elemento em um índice específico na lista
    public void add(int index, int element) {
        if (index < 0 || index > count) { // verifica se o índice está dentro dos limites da lista
            throw new IndexOutOfBoundsException("Índice fora dos limites."); // lança uma exceção se o índice estiver fora dos limites
        }
        if (index == 0) { // se o índice for 0, significa que o elemento deve ser adicionado no início da lista
            Node newNode = new Node(element); // cria um novo nodo com o elemento especificado
            newNode.next = head; // o próximo do novo nodo aponta para a cabeça atual
            head = newNode; // atualiza a cabeça da lista para o novo nodo
            if (tail == null) { // se a lista estava vazia
                tail = head; // o novo nodo também se torna a cauda da lista
            }
        } else if (index == count) { // se o índice for igual ao tamanho da lista, significa que o elemento deve ser adicionado no final
            add(element); // chama o método add padrão para adicionar no final da lista
        } else { // caso contrário, o elemento deve ser adicionado em algum lugar no meio da lista
            Node current = head; // inicia a busca a partir da cabeça da lista
            for (int i = 0; i < index - 1; i++) { // percorre a lista até o índice anterior ao desejado
                current = current.next; // avança para o próximo nodo
            }
            Node newNode = new Node(element); // cria um novo nodo com o elemento especificado
            newNode.next = current.next; // o próximo do novo nodo aponta para o nodo seguinte ao atual
            current.next = newNode; // atualiza o próximo do nodo atual para o novo nodo
        }
        count++; // incrementa o contador de elementos
    }

    // método para remover um elemento em um índice específico na lista
    public void remove(int index) {
        if (index < 0 || index >= count) { // verifica se o índice está dentro dos limites da lista
            throw new IndexOutOfBoundsException("Índice fora dos limites."); // lança uma exceção se o índice estiver fora dos limites
        }
        if (index == 0) { // se o índice for 0, significa que o elemento a ser removido é o primeiro da lista
            head = head.next; // atualiza a cabeça da lista para o próximo nodo
            if (head == null) { // se a lista ficar vazia após a remoção
                tail = null; // a cauda também se torna nula
            }
        } else { // se o elemento a ser removido não for o primeiro da lista
            Node current = head; // inicia a busca a partir da cabeça da lista
            for (int i = 0; i < index - 1; i++) { // percorre a lista até o índice anterior ao desejado
                current = current.next; // avança para o próximo nodo
            }
            current.next = current.next.next; // atualiza o próximo do nodo atual para o próximo do próximo nodo
            if (current.next == null) { // se o próximo do nodo atual for nulo após a remoção
                tail = current; // atualiza a cauda da lista para o nodo atual
            }
        }
        count--; // decrementa o contador de elementos
    }
}

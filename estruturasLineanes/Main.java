package estruturasLineanes;

public class Main {
    public static void main(String[] args) {
        ListaSEncadeada lista = new ListaSEncadeada();

        // adicionando elementos à lista
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        // imprimindo o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());

        // imprimindo todos os elementos da lista
        System.out.println("Elementos da lista:");
        for (int i = 0; i < lista.size(); i++) {
            Node node = lista.get(i);
            if (node != null) {
                System.out.println(node.element);
            } else {
                System.out.println("Node nulo encontrado.");
            }
        }

        // adicionando um elemento na posição 2
        lista.add(2, 25);

        // imprimindo todos os elementos da lista após a adição
        System.out.println("Elementos da lista após adição:");
        for (int i = 0; i < lista.size(); i++) {
            Node node = lista.get(i);
            if (node != null) {
                System.out.println(node.element);
            } else {
                System.out.println("Node nulo encontrado.");
            }
        }

        // removendo o elemento na posição 1
        lista.remove(1);

        // imprimindo todos os elementos da lista apó
    }
}
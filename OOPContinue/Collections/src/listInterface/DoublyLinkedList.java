package listInterface;

public class DoublyLinkedList {
    static class Node {
        String data;
        Node next;
        Node previous;

        public Node(String data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node("Betül");
        Node n2 = new Node("Selim");
        Node n3 = new Node("Ada");
        n1.next = n2;
        n2.previous = n1;

        n2.next = n3;
        n3.previous = n2;

        Node current = n1;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();

        Node current2 = n3;
        while (current2 != null) {
            System.out.println(current2.data);
            current2 = current2.previous;
        }
    }


}

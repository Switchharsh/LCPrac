import java.util.List;

public class linkedlists {
    public class LinkedList<E> implements ListI<E> {
        class Node<E> {
            E data;
            Node<E> next;

            public Node(E obj) {
                data = obj;
                next = null;
            }
        }

        private Node<E> head;
        private int currentSize;

        // Adding First
        public void addFirst(E obj) {
            Node<E> node = new Node<E>(obj);
            node.next = head;
            head = node;
        }
    }
}
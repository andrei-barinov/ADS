package main.java.ru.barinov.hw4.simpleLinkedList;


public interface LinkedList<E> {

    void insertFirst(E value);

    void  insert(int index, E value);

    E removeFirst();

    boolean remove(E value);

    boolean contains(E value);

    int size();

    boolean isEmpty();

    void display();

    E getFirst();

    public class Node<E>{
        E value;
        Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }
}

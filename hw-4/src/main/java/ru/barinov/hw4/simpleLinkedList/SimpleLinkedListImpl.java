package main.java.ru.barinov.hw4.simpleLinkedList;

public class SimpleLinkedListImpl<E> implements LinkedList<E> {

    protected Node<E> first;
    protected int size;

    @Override
    public void insertFirst(E value) {
        first = new Node<>(value, first);
        size++;
    }

    @Override
    public void insert(int index, E value) {
        if (isEmpty() || index == 0){
            insertFirst(value);
        } else {
            if (index > size){
                System.out.println("Индекс больше чем size");
            }else {
                Node<E> prev = null;
                Node<E> current = first;
                for (int i = 0; i < index; i++){
                    prev = current;
                    current = current.next;
                }

                Node<E> newNode = new Node<>(value, current);
                prev.next = newNode;
                newNode.next = current;
                size++;
            }
        }
    }

    @Override
    public E removeFirst() {
        if(isEmpty()){
            return null;
        }

        Node<E> removedNode = first;
        first = removedNode.next;
        removedNode.next = null;
        size--;
        return removedNode.value;
    }


    @Override
    public boolean remove(E value) {
        Node<E> prev = null;
        Node<E> current = first;

        while (current != null){
            if(current.value.equals(value)){
                break;
            }
            prev = current;
            current = current.next;
        }

        if(current == null){
            return false;
        }

        if(current == first){
            removeFirst();
            return true;
        }

        prev.next = current.next;
        current.next = null;
        size--;

        return true;
    }

    @Override
    public boolean contains(E value) {
        return indexOf(value) != null;
    }

    private Node<E> indexOf(E value){
        Node<E> current = first;

        while (current != null){
            if(current.value.equals(value)){
                return current;
            }
            current = current.next;
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = first;

        while (current != null){
            sb.append(current.value);
            if(current.next != null){
                sb.append(" -> ");
            }
            current = current.next;
        }

        return sb.append("]").toString();
    }

    @Override
    public E getFirst() {
        if(isEmpty()){
            return null;
        }
        return first.value;
    }
}

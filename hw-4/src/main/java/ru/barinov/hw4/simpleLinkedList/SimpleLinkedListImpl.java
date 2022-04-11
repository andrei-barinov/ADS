package main.java.ru.barinov.hw4.classes;

import main.java.ru.barinov.hw4.interfaces.LinkedList;

public class SimpleLinkedListImpl<E> implements LinkedList<E> {

    protected Node<E> first;
    protected int size;

    @Override
    public void insertFirst(E value) {
        first = new Node<>(value, first);
    }

    @Override
    public E removeFirst() {
        if(isEmpty()){
            return null;
        }

        Node<E> removedNode = first;
        first = removedNode.next;
        return null;
    }

    @Override
    public boolean remove(E value) {
        return false;
    }

    @Override
    public boolean contains(E value) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void display() {

    }

    @Override
    public E getFirst() {
        return null;
    }
}

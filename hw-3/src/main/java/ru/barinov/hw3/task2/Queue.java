package main.java.ru.barinov.hw3.queue;

public interface Queue<E> {

    boolean insert(E value);

    E remove();

    E peakFront();

    int size();

    boolean isEmpty();

    boolean isFull();

    void display();
}

package main.java.ru.barinov.hw3.queue;

import java.util.Arrays;

public class MyQueue<E> implements Queue<E>{
    private final E[] data;
    private int size;
    private int tail;
    private int head;

    public MyQueue(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        tail = -1;
        head = 0;
    }

    @Override
    public boolean insert(E value) {
        if (isFull()){
            return false;
        }
        //Организовать закольцовывание
        if(tail == data.length - 1){
            tail = 0;
        } else {
            tail++;
        }
        data[tail] = value;
        size++;
        return true;
    }

    @Override
    public E remove() {
        if(isEmpty()){
            return null;
        }

        //Организовать закольцовывание
        E value = data[head];
        data[head] = null;
        if (head == data.length - 1){
            head = 0;
        } else {
            head++;
        }
        size--;
        return value;
    }

    @Override
    public E peakFront() {
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
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= data.length - 1; i++){
            if (data[i] != null){
                sb.append(data[i]);
                sb.append(", ");
            }
        }
        if(size != 0){
            sb.delete(sb.length()-2, sb.length());
        }
        return sb.append("]").toString();
    }
}

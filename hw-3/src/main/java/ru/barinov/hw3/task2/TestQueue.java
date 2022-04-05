package main.java.ru.barinov.hw3.queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new MyQueue<>(4);

        System.out.println("add element: " + queue.insert(3));
        System.out.println("add element: " + queue.insert(5));
        System.out.println("add element: " + queue.insert(8));
        System.out.println("add element: " + queue.insert(11));
        System.out.println("add element: " + queue.insert(19));
        System.out.println("add element: " + queue.insert(198));
        System.out.println("add element: " + queue.insert(145));
        System.out.println("add element: " + queue.insert(17));
        System.out.println("add element: " + queue.insert(197));

        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();
        System.out.println("add element: " + queue.insert(198) + " 198");
        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();
        System.out.println("add element: " + queue.insert(11) + " 11");
        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();
    }
}

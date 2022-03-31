package main.java.ru.barinov.hw2;

import main.java.ru.barinov.hw2.entity.Notebook;
import main.java.ru.barinov.hw2.sort.SelectionSort;

public class Main{
    public static void main(String[] args) {
        Notebook[] notebookArray = SelectionSort.initArr(10000);
        SelectionSort.sort(notebookArray);

        for (int i = 0; i < 100; i++){
            System.out.println(notebookArray[i].getPrice() + " " + notebookArray[i].getMemory() + " " + notebookArray[i].getProducer());
        }
    }

}
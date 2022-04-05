package main.java.ru.barinov.hw3.task1;

import java.util.Arrays;

public class TestSearchNumber {
    public static void main(String[] args) {
//        Integer[] arr = {};
//        System.out.println("Пропущено: 1");
//        System.out.println("Найдено пропущенное число: " + SearchNumber.search(arr));

//        Integer[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
//        System.out.println("Пропущено: 1");
//        System.out.println("Найдено пропущенное число: " + SearchNumber.search(arr));

//        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
//        System.out.println("Пропущено: 18");
//        System.out.println("Найдено пропущенное число: " + SearchNumber.search(arr));

//        Integer[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
//        System.out.println("Пропущено: 5");
//        System.out.println("Найдено пропущенное число: " + SearchNumber.search(arr));

//        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 20};
//        System.out.println("Пропущено: 18");
//        System.out.println("Найдено пропущенное число: " + SearchNumber.search(arr));

        Integer[] arr = new Integer[10000];
        for (int i = 0; i < 10000; i++){
            if (i >= 7753){
                arr[i] = i + 2;
            } else {
            arr[i] = i + 1;
            }
        }
        System.out.println("Пропущено: 7754");
        System.out.println("Найдено пропущенное число: " + SearchNumber.search(arr));

    }
}

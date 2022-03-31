package main.java.ru.barinov.hw2.sort;

import main.java.ru.barinov.hw2.entity.Notebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SelectionSort {
    private static Map<String, Integer> mapProducer = new HashMap<>(
            (Map.of("Lenovo", 1, "Asus", 2, "MacNote", 3, "Acer", 4, "Xiaomi", 5)));

    public static void sort(Notebook[] arr){

        for (int i = 0; i < arr.length; i++){
            int min = i;
            for (int j = min + 1; j < arr.length; j++){

                if(arr[j].getPrice() < arr[min].getPrice()){
                    min = j;
                }
                if(arr[j].getPrice().equals(arr[min].getPrice()) && arr[j].getMemory() < arr[min].getMemory()){
                    min = j;
                }
                if(arr[j].getPrice().equals(arr[min].getPrice())
                        &&
                        arr[j].getMemory().equals(arr[min].getMemory())
                        &&
                        mapProducer.get(arr[j].getProducer()) < mapProducer.get(arr[min].getProducer())){
                    min = j;
                }

            }

            Notebook temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    public static Notebook[] initArr(Integer n){ // Функция для формирования массива с заданным количеством ноутбуков

        Notebook[] notebookArray = new Notebook[n];

        int[] notebookPrice = new int[31]; //Инициализируем массив с ценами
        int p = 500;
        for (int i = 0; i <= 30; i++){ //Заполняем массив с ценами
            notebookPrice[i] = p;
            p += 50;
        }

        int[] notebookMemory = {4, 8, 12, 16, 20, 24}; //Массив со значениями памяти

        String[] notebookProducer = new String[5]; //Инициализируем массив с производителями
        Set<String> setProducer = mapProducer.keySet(); //Получаем множество ключей из Map
        int k = 0;
        for ( String producer : setProducer ){ //Заполняем массив производителей
            notebookProducer[k] = producer;
            k++;
        }


        for (int i = 0; i < n; i++){ // Формируем массив ноутбуков
            int price = notebookPrice[rnd(0, 30)];
            int memory = notebookMemory[rnd(0, 5)];
            String producer = notebookProducer[rnd(0, 4)];

            notebookArray[i] = new Notebook(price, memory, producer);

        }
        return notebookArray;
    }

    public static int rnd(int min, int max){ //Функция для генерации рандомного числа в диапазоне[min, max]
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}

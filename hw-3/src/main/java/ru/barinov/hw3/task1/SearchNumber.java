package main.java.ru.barinov.hw3.task1;

public class SearchNumber {

    public static int search(Integer[] arr){
        int start = 0;
        int end = arr.length - 1;
        int base;
        int n = 0;


        if(arr.length == 0){
            return n = 1;
        } else if(arr[end] - end == 2 && arr[0] != 1) {
            return  n = arr[start] - 1;
        }else if(arr[end] - end == 1 && arr[0] == 1){
            return n = arr[end] + 1;
        } else{
            while(true){
                base = (end + start) / 2;
                if (arr[base] - arr[base - 1] == 2 || (arr[base + 1] - arr[base] == 2)) {
                    if (arr[base] - arr[base - 1] == 2){
                        n = arr[base] - 1;
                    } else {
                        n = arr[base] + 1;
                    }
                    break;
                } else if(arr[start] - start == 1 && arr[base] - base == 2){
                    end = base - 1;
                }else {
                    start = base + 1;
                }
                }
            }
        return  n;
        }
    }

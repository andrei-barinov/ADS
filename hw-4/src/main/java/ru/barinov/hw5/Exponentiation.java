package main.java.ru.barinov.hw5;

public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(pow(2, -10));
    }

    private static double pow(long a, long n){
        if (n < 0){
            long m = n * (-1);

            if(m == 0){
                return a;
            }
            return 1 / (a * pow(a, m - 1));
        } else {
        if (n == 0) {
            return 1;
        }
        return a * pow(a, n - 1);
        }
    }
}

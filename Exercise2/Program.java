package Exercise2;

/*
 * Задание 2. 
 * 2. Вывести все простые числа от 1 до 1000
*/

public class Program {
    public static void main(String[] args) {
        int n;
        for (int i = 2; i <= 1000; i++) {
           n = 0;
           for (int j = 2; j <= i / 2; j++) {
              if (i % j == 0) {
                 n++;
                 break;
              }
           }
           if (n == 0 && i != 1)
              System.out.print(i + " ");
        }
    }
}
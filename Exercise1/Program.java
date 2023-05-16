package Exercise1;

import java.util.Scanner;

/* 
 * Задание 1.
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
*/

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        // Вычисление n-ого треугольного числа
        int Number = 0;
        for (int i = 1; i <= n; i++) {
            Number += i;
        }
        System.out.println("n-ое треугольное число: " + Number);

        // Вычисление факториала числа n
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа n: " + factorial);
       }
    }
package Exercise3;

import java.util.Scanner;

/*
 * Задание 3. 
 * 3. Реализовать простой калькулятор
*/

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Сложение
        System.out.println("Сложение: " + (num1 + num2));
  
        // Вычетание
        System.out.println("Вычетание: " + (num1 - num2));
  
        // Умножение
        System.out.println("Умножение: " + (num1 * num2));
  
        // Деление
        System.out.println("Деление: " + (num1 / num2));
    }
}
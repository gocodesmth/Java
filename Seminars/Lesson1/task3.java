// Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
package Seminars.Lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean PrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    PrimeNumber = false;
                    break;
                }
            }

            if (PrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}
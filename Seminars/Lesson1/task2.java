//Вычислить n! (произведение чисел от 1 до n)
package Seminars.Lesson1;


import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.printf("Введите число n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int mult = 1;
        for (int i = 1; i <= n; i++) {
        mult *= i;            
        }
       
        System.out.printf("Произведение чисел от 1 до %d: %d%n", n, mult);
        num.close();
     }
}
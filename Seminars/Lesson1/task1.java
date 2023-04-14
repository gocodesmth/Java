// Вычислить n-ое треугольного число (сумма чисел от 1 до n)
package Seminars.Lesson1;

import java.util.Scanner;

public class task1 {
    public static int num(int a) {
        return (a * (a + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", num(i));
        iScanner.close();
    }
}

// Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.
package Seminars.Lesson1;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите уравнение: ");

        String equation = scanner.nextLine();

        String[] parts = equation.split("\s*[+=]\s*");  // разбиваем строку на части

        

        int q = -1, w = -1, e = -1;

        for (int i = 0; i < 10; i++) {  // перебираем все цифры от 0 до 9

            if (q == -1 && !parts[0].contains("?")) {

                q = Integer.parseInt(parts[0]);

            }

            if (w == -1 && !parts[1].contains("?")) {

                w = Integer.parseInt(parts[1]);

            }

            if (e == -1 && !parts[2].contains("?")) {

                e = Integer.parseInt(parts[2]);

            }

            

            if (parts[0].charAt(i) == '?') {

                q = i;

            }

            if (parts[1].charAt(i) == '?') {

                w = i;

            }

            if (parts[2].charAt(i) == '?') {

                e = i;

            }

        }

        

        if (q + w == e && q != -1 && w != -1 && e != -1) {  // проверяем равенство уравнения

            System.out.printf("%d + %d = %d", q, w, e);

        } else {

            System.out.println("Решений нет");

        }

    }

}
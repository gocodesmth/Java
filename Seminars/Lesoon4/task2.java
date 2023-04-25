// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.
package Seminars.Lesoon4;

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(linked_list, getRandomNumber()); 
        }
        System.out.println(linked_list);

        System.out.println(dequeue(linked_list)); 
        System.out.println(linked_list);

        System.out.println(first(linked_list)); 
        System.out.println(linked_list); 
    }

    public static void enqueue(LinkedList<Integer> linked_list, int num) {
        linked_list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> linked_list) { 
        int num = linked_list.get(0);
        linked_list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> linked_list) { 
        int num = linked_list.get(0);
        return num;
    }

    public static int getRandomNumber() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}

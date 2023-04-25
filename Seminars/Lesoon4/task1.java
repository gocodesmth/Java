// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернёет «перевёрнутый» список.
package Seminars.Lesoon4;

import java.util.LinkedList;
import java.util.ListIterator;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(reversLinkedList(list));
    }

    static LinkedList<Integer> reversLinkedList(LinkedList<Integer> array){
        LinkedList<Integer> result = new LinkedList<>();
        ListIterator<Integer> iterator = array.listIterator(array.size());
        while (iterator.hasPrevious()) {
            result.add(iterator.previous());
        }
        return result;    
    }
}

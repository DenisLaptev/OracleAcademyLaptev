package HomeWork.Programming.Practice3;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by lapte on 09.06.2016.
 */
public class ArrayListVSLinkedList {

    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();
        myAL.add(1);
        myAL.add(2);
        myAL.add(3);
        myAL.add(4);
        myAL.add(5);

        System.out.println("Время работы метода (мс) timeArrayListAddToTheEnd(myAL, 500000): " + timeArrayListAddToTheEnd(myAL, 500000));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        LinkedList<Integer> myLL = new LinkedList<>();
        myLL.add(1);
        myLL.add(2);
        myLL.add(3);
        myLL.add(4);
        myLL.add(5);
        myLL.add(2,100);
        System.out.println(myLL);
        System.out.println("Время работы метода (мс) timeLinkedListAddToTheEnd(myLL, 500000): " + timeLinkedListAddToTheEnd(myLL, 500000));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        System.out.println("Время работы метода (мс) timeArrayListAddToTheMiddle(myAL, 50000): " + timeArrayListAddToTheMiddle(myAL, 50000));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Время работы метода (мс) timeLinkedListAddToTheMiddle(myLL, 50000): " + timeLinkedListAddToTheMiddle(myLL, 50000));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        System.out.println("Время работы метода (мс) timeArrayListRemove(myAL, 5000): " + timeArrayListRemove(myAL, 5000));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Время работы метода (мс) timeLinkedListRemove(myLL, 5000): " + timeLinkedListRemove(myLL, 5000));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


    }

    public static long timeArrayListAddToTheEnd(ArrayList al, int numberOfOperations) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            al.add(1);
        }
        long finish = System.currentTimeMillis();
        long difference = finish - start; // время работы
        return difference;
    }


    public static long timeLinkedListAddToTheEnd(LinkedList ll, int numberOfOperations) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            ll.add(1);
        }
        long finish = System.currentTimeMillis();
        long difference = finish - start; // время работы
        return difference;
    }





    public static long timeArrayListAddToTheMiddle(ArrayList al, int numberOfOperations) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            al.add(1,4);
        }
        long finish = System.currentTimeMillis();
        long difference = finish - start; // время работы
        return difference;
    }


    public static long timeLinkedListAddToTheMiddle(LinkedList ll, int numberOfOperations) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            ll.add(1,4);
        }
        long finish = System.currentTimeMillis();
        long difference = finish - start; // время работы
        return difference;
    }



    public static long timeArrayListRemove(ArrayList al, int numberOfOperations) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            al.remove(0);
        }
        long finish = System.currentTimeMillis();
        long difference = finish - start; // время работы
        return difference;
    }


    public static long timeLinkedListRemove(LinkedList ll, int numberOfOperations) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            ll.remove(0);
        }
        long finish = System.currentTimeMillis();
        long difference = finish - start; // время работы
        return difference;
    }
}

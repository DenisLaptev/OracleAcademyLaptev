package HomeWork.Programming.Practice3.MyLinkedList;


/**
 * Created by lapte on 16.06.2016.
 */
public class MySmallLinkedList {
    public static void main(String[] args) {
        ElementOfTheLinkedList a0 = new ElementOfTheLinkedList();
        ElementOfTheLinkedList a1 = new ElementOfTheLinkedList();
        ElementOfTheLinkedList a2 = new ElementOfTheLinkedList();

        a0.setPreviousElement(a2);
        a0.setNextElement(a1);

        a1.setPreviousElement(a0);
        a1.setNextElement(a2);

        a2.setPreviousElement(a1);
        a2.setNextElement(a0);


        a0.setValue(45);

        System.out.println(a0);
        System.out.println(a1);
        System.out.println(a2);
    }
}


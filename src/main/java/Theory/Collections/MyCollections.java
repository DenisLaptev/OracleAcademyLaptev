package Theory.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lapte on 04.07.2016.
 */
public class MyCollections {

    // Каждый раз, когда мне нужно было пройтись по всем элементам
    // List-а, я по-новой объявлял итератор:
    // humanIterator = humanList.iterator();
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>(Arrays.asList(new Human("Vasja", 25),
                new Human("Kolja", 15),
                new Human("Masha", 20),
                new Human("Petja", 35)));

        Iterator<Human> humanIterator = humanList.iterator();
        System.out.println(humanList.getClass().getName());
        while (humanIterator.hasNext()) {
            System.out.println(humanIterator.next());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Human human : humanList) {
            System.out.println(human);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
/*

    //Почему-то здесь выдаёт ошибку. java.util.ConcurrentModificationException
    // Но этот же код-блок ниже (75-79) не вызывает ошибку.
        for (Human human : humanList) {
            if(human.getName().equals("Kolja")){
                humanList.remove(human);
            }
        }

*/


        humanIterator = humanList.iterator();
        while (humanIterator.hasNext()) {
            System.out.println(humanIterator.next());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        humanIterator = humanList.iterator();
        while (humanIterator.hasNext()) {
            System.out.println("flag");
            if (humanIterator.next().getName().equals("Kolja")) {
                humanIterator.remove();
                System.out.println("flagRemove");
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Human human : humanList) {
            if (human.getName().equals("Masha")) {
                humanList.remove(human);
            }
        }

        for (Human human : humanList) {
            if (human.getName().equals("Kolja")) {
                humanList.remove(human);
            }
        }


        for (Human human : humanList) {
            System.out.println(human);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(humanIterator.hasNext());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        humanIterator = humanList.iterator();
        while (humanIterator.hasNext()) {
            System.out.println(humanIterator.next());
        }


        // Переход из списка к массиву и из массива в список.

        Human[] humans = humanList.toArray(new Human[0]);
        List<Human> humanList1 = Arrays.asList(humans);


    }
}

package HomeWork.Programming.Practice3.Collections.table_of_words_in_the_text;

import java.util.*;

/**
 * Created by lapte on 17.07.2016.
 */
public class SortedHashMapExample {
    public static void main(String[] args) {


        HashMap<String, Person> people = new HashMap<String, Person>();

        Person jim = new Person("Jim", 55);
        Person scott = new Person("Scott", 28);
        Person anna = new Person("Anna", 100);


        people.put(jim.getName(), jim);
        people.put(scott.getName(), scott);
        people.put(anna.getName(), anna);

        // not yet sorted
        List<Person> peopleByAge = new ArrayList<Person>(people.values());

        Collections.sort(peopleByAge, new Comparator<Person>() {

            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("sorted by age:");
        for (Person p : peopleByAge) {
            System.out.println(p.getName() + "\t" + p.getAge());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        // not yet sorted
        List<Person> peopleByName = new ArrayList<Person>(people.values());

        Collections.sort(peopleByName, new Comparator<Person>() {

            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("sorted by name:");
        for (Person p : peopleByName) {
            System.out.println(p.getName() + "\t" + p.getAge());
        }

















    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

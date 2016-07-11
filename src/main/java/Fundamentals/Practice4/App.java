package Fundamentals.Practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * 1. Создать класс Student. Переопределить в нём методы toString(), equals(), hashCode().
 * <p/>
 * 2. Разработать своё пользовательское исключение как подкласс класса Exception и затем
 * использовать его при обработке ситуаций ошибок ввода.
 * <p/>
 * 3. Продемонстрировать работу с классом и обработку исключений. Создать класс Group,
 * формирующий группу студентов (набор объектов Student) путём ввода их параметров с
 * консоли (студенты сохраняются в массив, размерность которого указывается при создании
 * объекта group).
 * <p/>
 * 4. По окончанию заполнения группы распечатать состав группы.
 * <p/>
 * Created by lapte on 29.05.2016.
 */
public class App {
    public static int getSizeOfTheGroup() throws IOException {
        System.out.println("Введите размер группы (число студентов).");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
    static int groupSize;

    static {
        try {
            groupSize = getSizeOfTheGroup();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        final String[] NAMES = {"Иван", "Пётр", "Сидор", "Анатолий", "Альберт"};
        Random r = new Random();


        Student[] students = new Student[groupSize];
        String[] studentName = new String[groupSize];
        int[] studentAge = new int[groupSize];

        for (int i = 0; i < groupSize; ) {
            studentName[i] = NAMES[r.nextInt(NAMES.length)];
            System.out.println("Введите возраст студента " + studentName[i]);
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                studentAge[i] = Integer.parseInt(reader.readLine());
                if (studentAge[i] > 100 || studentAge[i] < 14) {
                    throw new MyException();
                } else {
                    students[i] = new Student(studentName[i], studentAge[i]);
                    int count = 0;
                    for (int j = 0; j <i ; j++) {

                        if (studentAge[i]==studentAge[j]) {
                            count++;

                        }
                    }
                    System.out.println("В группе уже есть " + count + " студентов такого возраста.");
                    i++;
                }
            } catch (MyException exception) {
                System.out.println("Не верные данные. Попробуйте ещё раз.");
            }

        }
        Group group = new Group("Group1", groupSize, students);



        //Вывод группы студентов на экран.
        System.out.println("Группа студентов:");
        System.out.println(group);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        //Вывод информации о конкретных студентах.
        System.out.println("Вывод информации о студенте по имени " + "Альберт");
        group.getStudentInformation("Альберт");

        System.out.println("Вывод информации о студенте по имени " + "Пётр");
        group.getStudentInformation("Пётр");

    }


}

package HomeWork.Programming.Practice3.Collections;

import java.util.*;

/**
 * Created by lapte on 16.07.2016.
 */
public class StudentUtils {

    static Map<String, Student> createMapFromList(List<Student> students) {
        // Метод, создающий Map<String, Student> из List<Student>.
        Map<String, Student> mapOfStudents = new HashMap<String, Student>();
        for (Student student : students) {
            mapOfStudents.put(student.getFirstName() + " " + student.getLastName(), student);
        }
        return mapOfStudents;
    }


    static void printStudents(List<Student> students, int course) {
        // Метод выводит на экран список студентов данного курса.
        String str = "";
        int flag = 0;
        for (Student student : students) {
            if (student.getCourse() == course) {
                str += student.toString() + "\n";
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Студентов " + course + "-го курса нет." + "\n");
        } else {
            System.out.println("Список студентов " + course + "-го курса: \n" + str);
        }

    }


    static List<Student> sortStudentByName(List students) {
// Метод сотрирует студентов по имени и выводит на экран.
        List<Student> listOfSortedByNameStudents = students;

        Collections.sort(students, StudentUtils.Comparators.NAME);
        /*
        for (Object student : students) {
            System.out.println(student);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        */
        listOfSortedByNameStudents = students;

        return listOfSortedByNameStudents;
    }

    static List<Student> sortStudentByCourse(List students) {
// Метод сотрирует студентов по курсу и выводит на экран.
        List<Student> listOfSortedByCourseStudents = students;

        Collections.sort(students, Comparators.COURSE);
        /*
        for (Object student : students) {
            System.out.println(student);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        */
        listOfSortedByCourseStudents = students;

        return listOfSortedByCourseStudents;
    }

    static List<Student> sortStudentByNameAndCourse(List students) {
// Метод сотрирует студентов по имени и по курсу и выводит на экран.
        List<Student> listOfSortedByNameAndCourseStudents = students;

        Collections.sort(students, Comparators.NAMEANDCOURSE);
        /*
        for (Object student : students) {
            System.out.println(student);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        */
        listOfSortedByNameAndCourseStudents = students;

        return listOfSortedByNameAndCourseStudents;
    }


    public static void main(String[] args) {
        // Создаём List<Student> студентов.
        List<Student> students = Arrays.asList(
                new Student("Vasja", "Ivanov", 2),
                new Student("Ivan", "Ivanov", 1),
                new Student("Petja", "Petrov", 2),
                new Student("Denis", "Laptev", 4)
        );
        Map<String, Student> mapOfStudents;
        mapOfStudents = createMapFromList(students);

        // Распечатаем Map<String, Student>.
        System.out.println(mapOfStudents);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Map.Entry entry : mapOfStudents.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Выведем на экран списки студентов разных курсов.
        printStudents(students, 1);
        printStudents(students, 3);
        printStudents(students, 4);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // выведем данные без сортировки
        System.out.println("no sorted");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");



        // выведем данные с сортировкой
        List<Student> listOfSortedByNameStudents = sortStudentByName(students);
        System.out.println("by name");
        for (Student listOfSortedByNameStudent : listOfSortedByNameStudents) {
            System.out.println(listOfSortedByNameStudent);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");



        List<Student> listOfSortedByCourseStudents = sortStudentByCourse(students);
        System.out.println("by course");
        for (Student listOfSortedByCourseStudent : listOfSortedByCourseStudents) {
            System.out.println(listOfSortedByCourseStudent);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");



        List<Student> listOfSortedByNameAndCourseStudents = sortStudentByNameAndCourse(students);
        System.out.println("by name and course");
        for (Student listOfSortedByNameAndCourseStudent : listOfSortedByNameAndCourseStudents) {
            System.out.println(listOfSortedByNameAndCourseStudent);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

/*

        // выведем данные без сортировки
        System.out.println("============ no sorted ==============");

        for (Student student : students) {
            System.out.println(student);
        }


        // отсортируем и выведем студентов по имени
        System.out.println("========== sorted by name===========");

        Student[] studentsArrayByName = new Student[students.size()];
        studentsArrayByName = students.toArray(studentsArrayByName);
        Arrays.sort(studentsArrayByName, new NameComparator());

        for (Student student : studentsArrayByName) {
            System.out.println(student);
        }
        new ArrayList<Student>(Arrays.asList(studentsArrayByName));


        // отсортируем и выведем студентов по курсам
        System.out.println("========== sorted by course ===========");

        Student[] studentsArrayByCourse = new Student[students.size()];
        studentsArrayByCourse = students.toArray(studentsArrayByCourse);
        Arrays.sort(studentsArrayByCourse, new CourseComparator());

        for (Student student : studentsArrayByCourse) {
            System.out.println(student);
        }
        new ArrayList<Student>(Arrays.asList(studentsArrayByCourse));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        Collections.sort(students, Comparators.COURSE);

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Collections.sort(students, Comparators.NAMEANDCOURSE);

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

*/

    }


// Вложенный статический класс Comparators. Позволяет сравнивать студентов по разным параметрам.

    /*
    Usage:

    List<Student> studentList = new LinkedList<>();
    Collections.sort(studentList, StudentUtils.Comparators.NAME);

    */
    public static class Comparators {

        public static Comparator<Student> NAME = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getLastName() + " " + o1.getFirstName()).compareTo(o2.getLastName() + " " + o2.getFirstName());
            }
        };
        public static Comparator<Student> COURSE = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse() - o2.getCourse();
            }
        };
        public static Comparator<Student> NAMEANDCOURSE = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = (o1.getLastName() + " " + o1.getLastName()).compareTo(o2.getLastName() + " " + o2.getLastName());
                if (i == 0) {
                    i = o1.getCourse() - o2.getCourse();
                }
                return i;
            }
        };
    }


}


class NameComparator implements Comparator<Student> {

    public int compare(Student stud1, Student stud2) {

        String str1 = stud1.getLastName() + stud1.getFirstName();
        String str2 = stud2.getLastName() + stud2.getFirstName();

        return str1.compareTo(str2);
    }
}

class CourseComparator implements Comparator<Student> {

    public int compare(Student stud1, Student stud2) {

        int c1 = stud1.getCourse();
        int c2 = stud2.getCourse();

        int result = 0;
        if (c1 < c2) {
            result = -1;
        } else if (c1 > c2) {
            result = +1;
        } else {
            result = 0;
        }
        return result;
    }
}



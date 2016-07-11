package ProgrammingLectures.lecture_2.item_2;

/**
 * Created by Kovantonlenko on 11/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String(str1);
        String str3 = new String("Hello");

        boolean isEqual1 = str1 == str2; // false, ������ �������,
        // str1 �������� � ���� �����,
        // str2 � � ����

        boolean isEqual2 = str1.equals(str3); // true, ������� ������������

        boolean isEqual3 = str1.equals("hello"); // false, ������� �� ������������, ����� equals ������������ � �������� (case sensitive)

        System.out.println(isEqual1);
        System.out.println(isEqual2);
        System.out.println(isEqual3);

    }
}

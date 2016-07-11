package ProgrammingLectures.lecture_2.item_6;

/**
 * Created by Kovantonlenko on 11/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abce";
        String str3 = "aabc";
        String str4 = "aAbc";

        System.out.println(str1.equals(str2));    // ��������� �� ���������������
        System.out.println(str1.compareTo(str2)); // ���������� ������ � ������������������ �������

        System.out.println(str1.equals(str3));
        System.out.println(str1.compareTo(str3));

        System.out.println(str3.equals(str4));
        System.out.println(str3.compareTo(str4));
        System.out.println(str3.compareToIgnoreCase(str4));

    }
}

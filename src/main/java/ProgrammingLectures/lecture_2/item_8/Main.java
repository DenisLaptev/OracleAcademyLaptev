package ProgrammingLectures.lecture_2.item_8;

import java.util.StringTokenizer;

/**
 * Created by Kovantonlenko on 11/2/2015.
 */
public class Main {
    public static void main(String[] args) {

        String str = "This string, need to split, \n by spaces and commas";

        StringTokenizer st = new StringTokenizer(str); // �� ��������� ���������� ���������� �� \t\n\r\f

        System.out.println("---- Split by space ------");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

        System.out.println("---- Split by comma ',' ------");
        StringTokenizer st2 = new StringTokenizer(str, ",");

        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }

}

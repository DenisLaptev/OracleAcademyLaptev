package Theory.ProgrammingLectures.lecture_2.item_3;

/**
 * Created by Kovantonlenko on 11/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        String str = "��������� ������ � ���� ������ - o";
        int last = str.length() - 1;//����� ������ - 1, ��� ��� ������ ���������� � 0

        char ch = str.charAt(last); //����� ��������� ������
        System.out.println(ch); // ������� "�"
    }
}

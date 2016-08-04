package Theory.ProgrammingLectures.lecture_2.item_7;

/**
 * Created by Kovantonlenko on 11/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        String str = "Hello my world";
        String criteria = "myqw";

        System.out.println(str.regionMatches(6, criteria, 0, criteria.length() - 2));
        // ������� "true", ����� �� ���� ���������� ������� ������ 6


        String searchMe = "Green Eggs and Ham";
        String findMe = "Eggs";

        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();

        boolean foundIt = false;

        for (int i = 0; i <= (searchMeLength - findMeLength); i++) {
            if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {
                foundIt = true;
                System.out.println(searchMe.substring(i, i + findMeLength));// �Eggs�
                break;
            }
        }
        if (!foundIt)
            System.out.println("No match found.");


    }
}

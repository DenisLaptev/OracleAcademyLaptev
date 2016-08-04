package Theory.ProgrammingLectures.lecture_2.item_5;

/**
 * Created by Kovantonlenko on 11/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        String myPhoneNumber = "(+3)8-093-1234567";

        String[] byDigit = myPhoneNumber.split("-");
        for (String s : byDigit) {
            System.out.println(s);
        }

        System.out.println("Operator's code is " + byDigit[1]); // Operator's code is 093

        System.out.println("Phone number without code " + byDigit[2]);// Phone number without code 1816482

    }
}

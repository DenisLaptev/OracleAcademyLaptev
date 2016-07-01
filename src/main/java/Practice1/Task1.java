package Practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lapte on 02.06.2016.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        String myWord = "string";
        while (!(myWord.equals("quit"))) {

            myWord = getWordFromUser();


            int numberOfParts = 0;
            char[] charArray = new char[myWord.length()];
            for (int i = 0; i < myWord.length(); i++) {
                charArray[i] = myWord.charAt(i);
            }

            for (int i = 0; i < myWord.length(); i++) {
                if (isLetter(charArray[i])) {
                    numberOfParts++;
                }
            }

            String[] array = new String[numberOfParts];

            int beginIndex = 0;

            if(isLetter(charArray[myWord.length() - 1])) {
                f1:
                for (int j = 0; j < numberOfParts; j++) {
                    for (int i = beginIndex; i < myWord.length(); ) {
                        if (isLetter(charArray[i])) {
                            array[j] = myWord.substring(beginIndex, i + 1);
                            beginIndex += array[j].length();
                            continue f1;
                        }
                        i++;
                    }
                }
            }else{
                f1:
                for (int j = 0; j < numberOfParts-1; j++) {
                    for (int i = beginIndex; i < myWord.length(); ) {
                        if (isLetter(charArray[i])) {
                            array[j] = myWord.substring(beginIndex, i + 1);
                            beginIndex += array[j].length();
                            continue f1;
                        }
                        i++;
                    }
                }
                array[numberOfParts-1] = myWord.substring(beginIndex);
            }

            if (!(myWord.equals("quit"))) {

                System.out.println("number of parts is: " + numberOfParts);
                for (int i = 0; i < numberOfParts; i++) {
                    System.out.println(array[i]);
                }
                System.out.println("write: \"quit\" for exit");

            }else{
                System.out.println("Thank you!");
            }
        }
    }

    private static String getWordFromUser() throws IOException {
        String myWord;
        System.out.println("Enter a word");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        myWord = reader.readLine();
        return myWord;
    }

    private static boolean isLetter(char c) {
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o')
                || (c == 'u') || (c == 'y');
    }
}

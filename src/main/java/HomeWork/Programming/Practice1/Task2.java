package HomeWork.Programming.Practice1;

/**
 * Created by lapte on 02.06.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        String myStringPlus = "a";
        String myStringConcat = "a";
        StringBuilder myStringBuilder = new StringBuilder("a");
        StringBuffer myStringBuffer = new StringBuffer("a");


        System.out.println("timeMethodStringPlus(myStringPlus, 100000): " + timeMethodStringPlus(myStringPlus, 100000));
        System.out.println("timeMethodStringConcat(myStringConcat, 100000): " + timeMethodStringConcat(myStringConcat, 100000));
        System.out.println("timeMethodStringBuilder(myStringBuilder, 100000): " + timeMethodStringBuilder(myStringBuilder, 100000));
        System.out.println("timeMethodStringBuffer(myStringBuffer, 100000): " + timeMethodStringBuffer(myStringBuffer, 100000));
    }

    public static long timeMethodStringPlus(String str, int numberOfOperations) {

        long startStringPlus = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            str += "a";
        }
        long finishStringPlus = System.currentTimeMillis();
        long diffStringPlus = finishStringPlus - startStringPlus; // время работы
        return diffStringPlus;
    }


    public static long timeMethodStringConcat(String str, int numberOfOperations) {

        long startStringPlus = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            str.concat("a");
        }
        long finishStringPlus = System.currentTimeMillis();
        long diffStringPlus = finishStringPlus - startStringPlus; // время работы
        return diffStringPlus;
    }


    public static long timeMethodStringBuilder(StringBuilder sbdr, int numberOfOperations) {

        long startStringPlus = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            sbdr.append("a");
        }
        long finishStringPlus = System.currentTimeMillis();
        long diffStringPlus = finishStringPlus - startStringPlus; // время работы
        return diffStringPlus;
    }


    public static long timeMethodStringBuffer(StringBuffer sbfr, int numberOfOperations) {

        long startStringPlus = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            sbfr.append("a");
        }
        long finishStringPlus = System.currentTimeMillis();
        long diffStringPlus = finishStringPlus - startStringPlus; // время работы
        return diffStringPlus;
    }
}

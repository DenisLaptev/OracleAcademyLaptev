package ProgrammingLectures.lecture_6_IO.item_6;

import java.io.*;

import static ProgrammingLectures.lecture_6_IO.item_6.DataStreams.BOOLEAN;


/**
 * Created by Kovantonlenko on 11/30/2015.
 */
public class DataWriteReader {
    static String fileName = "src\\main\\java\\com\\kov\\lecture_6_IO\\item_6\\test.txt";

    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(new File(fileName)));
        DataInputStream in = new DataInputStream(new FileInputStream(new File(fileName)));

        write(out);
        read(in);
    }

    public static void write(DataOutputStream out) throws IOException {
        for (int i = 0; i < 3; i++) {
//            out.writeDouble(DOUBLES[i]);
//            out.writeInt(INTS[i]);
//            out.writeUTF(STRINGS[i]);
            out.writeBoolean(BOOLEAN[i]);
        }
    }

    public static void read(DataInputStream in) throws IOException {
        double resDouble = 0;
        int resInt = 0;
        String resString = "";
        Boolean resBoolean = null;
        try {
            while (true) {
//                resDouble += in.readDouble();
                resInt += in.readInt();
//                resString += in.readUTF();
//                System.out.println(in.readBoolean());
            }
        } catch (EOFException e) {
            System.out.println("End of the file");
            System.out.println("Sum of the double = " + resDouble);
            System.out.println("Sum of the int = " + resInt);
            System.out.println("String concat = " + resString);
        }
    }
}

class DataStreams {
    /* static final double[] DOUBLES = {1.1, 2.2, 3.3};
     static final int[] INTS = {1, 2, 3};
     static final String[] STRINGS = {"A", "B", "C"};*/
    static final Boolean[] BOOLEAN = {true, true, false};
}
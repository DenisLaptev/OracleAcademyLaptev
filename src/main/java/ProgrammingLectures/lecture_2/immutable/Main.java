package ProgrammingLectures.lecture_2.immutable;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        ImmutableClass immutableClass = ImmutableClass.createNewInstance(100, "hello", calendar.getTime());
        System.out.println("before change " + immutableClass);

        Date mutableField = immutableClass.setMutableField(10000000l);

        System.out.println("change " + mutableField);

        System.out.println("after change " + immutableClass);

       /* String str = "hello";
        String substring = str.substring(3);
        str = substring;
        System.out.println(substring);
        System.out.println(str);*/

//        String str = "hi" + "hello";

    }
}

final class ImmutableClass {

    private final Integer immutableField1; // immutable �� ���������
    private final String immutableField2; // immutable �� ���������
    private final Date mutableField;   // // mutable

    private ImmutableClass(Integer fld1, String fld2, Date date) {
        this.immutableField1 = fld1;
        this.immutableField2 = fld2;
        this.mutableField = new Date(date.getTime());
    }

    public static ImmutableClass createNewInstance(Integer fld1, String fld2, Date date) // ����� ��� �� ��������� �������� ����� ��������� �����
    {
        return new ImmutableClass(fld1, fld2, date);
    }

    /*�� ����� ������������� setter ������*/

    public Integer getImmutableField1() {
        return immutableField1;
    }


    public String getImmutableField2() {
        return immutableField2;
    }

    public Date setMutableField(long l) {

        return new Date(mutableField.getTime()); // ����� ������� ������ �� ����� ������
    }

    @Override
    public String toString() {
        return immutableField1 + " - " + immutableField2 + " - " + mutableField;
    }
}




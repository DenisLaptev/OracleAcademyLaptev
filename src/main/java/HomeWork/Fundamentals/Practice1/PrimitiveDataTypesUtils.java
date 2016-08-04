package HomeWork.Fundamentals.Practice1;

/*
* 1) Создайте класс, в котором присутствуют переменные класса всех примитивных типов.
* Выведите на экран значение полей класса без предварительной инициализации.
* Повторите тоже самое для локальных переменных.
*
* 2) Создайте несколько переменных типа float.
* Присвойте этим переменным следующие значения:
* 1.;
* 1;
* 0x1;
* 0b1;
* 1.0e1;
* 01;
*
* 3) Создайте переменную типа short.
* Инициализаируйте ее результатом выполнения следующих операций:
* - суммой двух целых чисел;
* - суммой целого и дробного чисел;
* - суммой значений переменных типов float и int;
* - суммой значений переменных типа byte + short;
* - суммой значений переменных типа float + double;
*
*
* 4) Заданы значения 2-х катетов и гипотенузы треугольника.
* Проверить является ли данный треугольник прямоугольным.
* Вычисления записать выражением, состоящим из одной строки (используя оператор “?:”).
*
*
* 5) Подсчитать сумму целых чисел от 1 до 20.
*
*
*
*/
public class PrimitiveDataTypesUtils {
    //Объявляем переменные (поля класса) всех 8 примитивных типов.
    public static byte myByte;
    public static short myShort;
    public static int myInt;
    public static long myLong;
    public static float myFloat;
    public static double myDouble;
    public static char myChar;
    public static boolean myBoolean;

    public static float f1 = (float) 1.;
    public static float f2 = 1;
    public static float f3 = 0x1;
    public static float f4 = 0b1;
    public static float f5 = 1.0e1F;
    public static float f6 = 01;

    public static short s1 = 3+4;
    public static short s2 = (short)(3 + 4.5);
    public static short s3 = (short)(f5 + myInt);
    public static short s4 = (short)(s2 + myByte);
    public static short s5 = (short) (myFloat + myDouble);







    public static void printClassFields() {
    //Метод, который выводин на экран значения переменных.

        //Объявляем переменные (локальные переменные) всех 8 примитивных типов.
        byte myByteLocal = 1;
        short myShortLocal = 1;
        int myIntLocal = 1;
        long myLongLocal = 1;
        float myFloatLocal = 1;
        double myDoubleLocal = 1;
        char myCharLocal = 'A';
        boolean myBooleanLocal = true;

        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);


        System.out.println("byte: " + myByteLocal);
        System.out.println("short: " + myShortLocal);
        System.out.println("int: " + myIntLocal);
        System.out.println("long: " + myLongLocal);
        System.out.println("float: " + myFloatLocal);
        System.out.println("double: " + myDoubleLocal);
        System.out.println("char: " + myCharLocal);
        System.out.println("boolean: " + myBooleanLocal);
    }


    public static void printFloatFields() {
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println("f5 = " + f5);
        System.out.println("f6 = " + f6);
    }



    public static void printShortFields() {
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
    }


    public static void Triangle(int a, int b, int c) {
         System.out.println((a*a+b*b==c*c) ? "треугольник со сторонами: " + a + ", " + b + ", " + c + " прямоугольный":"треугольник со сторонами: " + a + ", " + b + ", " + c + " не прямоугольный");
    }

    public static void Sum1_20() {
        int sum = 0;
        for (int i =1; i<=20; i++){
            sum+=i;
        }
        System.out.println("Сумма чисел от 1 до 20 равна: " + sum);
    }
}




package Practice2.JUNIT_Calculator;

/**
 * Created by lapte on 22.06.2016.
 */
public class Calculator {
    //Чтобы создать тест на метод,
    //ставим курсор на название метода и нажимаем :Alt+Enter
    //Вначале, ставим курсор на название класса и нажимаем :Alt+Enter. При
    //этом создастся класс-тест для данного класса.
    public static int sum(int...numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double sqrt(int i) {
        return Math.sqrt(i);
    }

    public static double difference (int a, int b) {
        double difference = 0;
        difference = a - b;
        return difference;
    }
    public static double division (int a, int b) {
        double division = 0;
        division = a / b;
        return division;
    }
}

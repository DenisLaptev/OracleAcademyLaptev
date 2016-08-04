package HomeWork.Fundamentals.Practice2;


 /*
 * Реализовать программу учета среднесуточной температуры на протяжении месяца.
 * Ввод данных реализовать с консоли. Вначале должен быть выведен запрос названия месяца,
 * затем значений температуры для каждого числа. Количество дней в месяце программа должна
 * определять автоматически.  Значения хранить в ArrayList. При вводе реализовать проверку
 * корректности вводимых данных, если данные введены не корректно - запросить ввод повторно.
 * После введения данных вывести среднемесячную температуру,
 * дату когда была максимальная температура и минимальная с указанием ее значения.
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by lapte on 16.05.2016.
 */
public class TemperatureTest {
    public static void main(String[] args) throws IOException {

        int intMonth = 1;
        String StringMonth = null;
        int numberOfMonthDays = 31;
        boolean flag = false;

        double averageTemperature = 0.0;
        double maxTemperature = 0.0;
        double minTemperature = 0.0;

        int dayOfTheMinTempetature = 1;
        int dayOfTheMaxTempetature = 1;



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (!flag){
            System.out.println("Введите номер месяца.");
            intMonth = Integer.parseInt(reader.readLine()); //преобразовываем строку в число.
            switch(intMonth) {
                case 1: {
                    StringMonth = "January";
                    numberOfMonthDays = 31;
                    flag = true;
                }
                break;
                case 2: {
                    StringMonth = "February";
                    numberOfMonthDays = 28;
                    flag = true;
                }
                break;
                case 3: {
                    StringMonth = "March";
                    numberOfMonthDays = 31;
                    flag = true;
                }
                break;
                case 4: {
                    StringMonth = "April";
                    numberOfMonthDays = 30;
                    flag = true;
                }
                break;
                case 5: {
                    StringMonth = "May";
                    numberOfMonthDays = 31;
                    flag = true;
                }
                break;
                case 6: {
                    StringMonth = "June";
                    numberOfMonthDays = 30;
                    flag = true;
                }
                break;
                case 7: {
                    StringMonth = "July";
                    numberOfMonthDays = 31;
                    flag = true;
                }
                break;
                case 8: {
                    StringMonth = "August";
                    numberOfMonthDays = 31;
                    flag = true;
                }
                break;
                case 9: {
                    StringMonth = "September";
                    numberOfMonthDays = 30;
                    flag = true;
                }
                break;
                case 10: {
                    StringMonth = "October";
                    numberOfMonthDays = 31;
                    flag = true;
                }
                break;
                case 11: {
                    StringMonth = "November";
                    numberOfMonthDays = 30;
                    flag = true;
                }
                break;
                case 12: {
                    StringMonth = "December";
                    numberOfMonthDays = 31;
                    flag = true;
                }
                break;
                default: {
                    System.out.println("Не корректный ввод. Введите номер месяца.");
                }
                break;
            }
        }
        ArrayList<Integer> arrayTemp = new  ArrayList<Integer>(numberOfMonthDays);
        for (int i = 0; i < numberOfMonthDays; i++) {
            System.out.println("Введите температуру " + (i+1) + " " + StringMonth + ":");
            arrayTemp.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println("Значения температуры в течение месяца.");
        for (int i = 0; i < numberOfMonthDays; i++) {
            System.out.println((i+1) + " " + StringMonth + ":" + arrayTemp.get(i));
        }

        //avarage temperature
        for (int i = 0; i < numberOfMonthDays; i++) {
            averageTemperature = arrayTemp.get(i);
        }
        System.out.println("Средняя температура за месяц "
                + StringMonth + " равна: " + averageTemperature/numberOfMonthDays);



        //max and min temperature
        for (int i = 0; i < numberOfMonthDays; i++) {
            if (maxTemperature < arrayTemp.get(i)){
                maxTemperature = arrayTemp.get(i);
                dayOfTheMaxTempetature = i+1;
            }
            if (minTemperature > arrayTemp.get(i)){
                minTemperature = arrayTemp.get(i);
                dayOfTheMinTempetature = i+1;
            }
        }
        System.out.println("Максимальная температура за месяц "
                + StringMonth + " равна: " + maxTemperature +". Она была "
                + dayOfTheMaxTempetature);
        System.out.println("Минимальная температура за месяц "
                + StringMonth + " равна: " + minTemperature +". Она была "
                + dayOfTheMinTempetature);
    }
}

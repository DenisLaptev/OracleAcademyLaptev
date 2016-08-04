package HomeWork.Programming.Practice1.Task3;

import java.util.ArrayList;

/**
 * Created by lapte on 02.06.2016.
 */
public class Task3Table {
    //Поля класса
    private ArrayList<Integer> count;
    private ArrayList<String> women;
    private ArrayList<String> men;

    //Конструктор
    public Task3Table(ArrayList<Integer> count,
                      ArrayList<String> women,
                      ArrayList<String> men) {
        setCount(count);
        setWomen(women);
        setMen(men);
    }

    //Методы класса
    public ArrayList<Integer> getCount() {
        return count;
    }

    public void setCount(ArrayList<Integer> count) {
        this.count = count;
    }

    public ArrayList<String> getWomen() {
        return women;
    }

    public void setWomen(ArrayList<String> women) {
        this.women = women;
    }

    public ArrayList<String> getMen() {
        return men;
    }

    public void setMen(ArrayList<String> men) {
        this.men = men;
    }

    @Override
    public String toString() {
        String TableFormat = "%-10s%-25s%-25s%n";
//        System.out.printf(TableFormat, "Номер", "Имя девочки", "Имя мальчика");
//        System.out.println("--------------------------------------------------------");
        String str = "";
        for (int j = 0; j < getCount().size(); j++) {
            str += String.format(TableFormat, getCount().get(j), getWomen().get(j), getMen().get(j)) + "\n";
        }
        return str;
    }
}

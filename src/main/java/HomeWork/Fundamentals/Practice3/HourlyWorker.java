package HomeWork.Fundamentals.Practice3;

/**
 * Created by lapte on 20.05.2016.
 */
public class HourlyWorker extends Employee {

    private int mainTime;
    private int overMainTime;

    public static final double MAIN_TIME_SALARY = 10;
    public static final double OVER_MAIN_TIME_SALARY = 15;


    public HourlyWorker(String name, String surname, int mainTime, int overMainTime) {
        super(name, surname);
        setMainTime(mainTime);
        setOverMainTime(overMainTime);
    }

    public int getMainTime() {
        return mainTime;
    }

    public void setMainTime(int mainTime) {
        this.mainTime = mainTime;
    }

    public int getOverMainTime() {
        return overMainTime;
    }

    public void setOverMainTime(int overMainTime) {
        this.overMainTime = overMainTime;
    }



    @Override
    public double calcSalary() {
        return getMainTime()*MAIN_TIME_SALARY + getOverMainTime()*OVER_MAIN_TIME_SALARY;
    }


    @Override
    public String toString() {
        return "HourlyWorker{" + "name=" + getName() +
                ", surname=" + getSurname() +
                ", mainTime=" + getMainTime() +
                ", overMainTime=" + getOverMainTime() +
                '}';
    }
}

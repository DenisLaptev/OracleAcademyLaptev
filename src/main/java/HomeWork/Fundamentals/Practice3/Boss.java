package HomeWork.Fundamentals.Practice3;

/**
 * Created by lapte on 20.05.2016.
 */
public class Boss extends Employee{
    private double weekSalary;

    public Boss(String name, String surname, double weekSalary) {
        super(name, surname);
        setWeekSalary(weekSalary);
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    @Override
    public double calcSalary() {
        return getWeekSalary() * 4;
    }

    @Override
    public String toString() {
        return "Boss{" + "name=" + getName() +
                ", surname=" + getSurname() +
                ", weekSalary=" + getWeekSalary() +
                "}";




    }
}

package HomeWork.Fundamentals.Practice3;

/**
 * Created by lapte on 20.05.2016.
 */
public class CommissionWorker extends Employee{

    public static final double SALES_PROCENT = 10;

    private double salary;
    private double sales;


    public CommissionWorker(String name, String surname, double salary, double sales) {
        super(name, surname);
        setSalary(salary);
        setSales(sales);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double calcSalary() {
        return getSalary() + getSales() / 100 * SALES_PROCENT;
    }

    @Override
    public String toString() {
        return "CommissionWorker{" + "name=" + getName() +
                ", surname=" + getSurname() +
                ", salary=" + getSalary() +
                ", sales=" + getSales() +
                '}';
    }
}

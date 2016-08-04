package HomeWork.Fundamentals.Practice3;

import java.util.ArrayList;

/**
 * Created by lapte on 20.05.2016.
 */
public class Firm {
    private String name;
    private ArrayList<Employee> empList = new ArrayList<Employee>();

    public Firm(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addEmployee (Employee emp) {
        for (Employee employee : empList) {
            if(employee.equals(emp)){
                return false;
            }

        }
        empList.add(emp);
        return true;
    }

    public void calcTotalSalary() {
        double totalSalary = 0.0;
        for (Employee employee : empList) {
            totalSalary += employee.calcSalary();
            employee.print();
        }
        System.out.println("Total salary: " + totalSalary);
    }
}

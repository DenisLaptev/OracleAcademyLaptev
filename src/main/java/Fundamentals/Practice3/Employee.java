package Fundamentals.Practice3;

/**
 * Сделать систему расчета заработной платы на предприятии.
 *
 * Сделать базовый класс Employee. В базовом классе определить 2 метода:
 * расчёт з/п сотрудника и
 * вывод на экран имени и фамилии рабочего.
 *
 * Производные классы от базового
 * класса Employee являются:
 *
 * класс Boss - начисляется еженедельный фиксированный оклад
 * независимо от числа отработанных часов;
 *
 * класс HourlyWorker - служащим начисляется почасовая з/п за часы,
 * отработанные в основное время, и повышенная плата за часы,
 * отработанные сверхурочно;
 *
 * класс PieceWorker - служащим начисляется сдельная плата по
 * количеству изготовленных изделий;
 *
 * класс CommissionWorker - служащим начисляется базовая з/п плюс
 * комиссионный процент от продаж.
 *
 *
 *
 * В главной программе показать
 * обработку информации всех типов служащих.
 * Можно создать массив или ArrayList типа Employee и добавить туда разные объекты.
 * Сделайте подсчёт сколько денег нужно выплатить в месяц всем рабочим.
 *
 *
 *
 *
 *
 * Created by lapte on 20.05.2016.
 */
public abstract class Employee {
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public abstract double calcSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name + '\'' +
                ", surname=" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return surname != null ? surname.equals(employee.surname) : employee.surname == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }

    // По динамическому связыванию для каждого типа сотрудника будут вызваны свои методы
    //toString() и calcSalary() (полиморфизм).

    public void print (){
        System.out.println(toString() + " salary: " + calcSalary());
    }


}

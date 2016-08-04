package HomeWork.Fundamentals.Practice3;

/**
 * Created by lapte on 20.05.2016.
 */
public class App {
    public static void main(String[] args) {
        Firm target = new Firm("Target");
        System.out.println(target.addEmployee(new Boss("Vasja", "Pupkin", 25000)));
        System.out.println(target.addEmployee(new HourlyWorker("Kolja", "Pupkin", 25, 10)));
        System.out.println(target.addEmployee(new PieceWorker("Pert", "Pupkin", 100)));
        System.out.println(target.addEmployee(new CommissionWorker("Ivan", "Pupkin", 5000, 50)));

        target.calcTotalSalary();
    }
}

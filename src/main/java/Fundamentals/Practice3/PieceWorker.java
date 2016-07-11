package Fundamentals.Practice3;

/**
 * Created by lapte on 20.05.2016.
 */
public class PieceWorker extends Employee {
    private int numberOfThings;

    public static final double THING_PRICE = 10;

    public PieceWorker(String name, String surname, int numberOfThings) {
        super(name, surname);
        setNumberOfThings(numberOfThings);
    }


    public int getNumberOfThings() {
        return numberOfThings;
    }

    public void setNumberOfThings(int numberOfThings) {
        this.numberOfThings = numberOfThings;
    }


    @Override
    public double calcSalary() {
        return getNumberOfThings()*THING_PRICE;
    }


    @Override
    public String toString() {
        return "PieceWorker{" + "name=" + getName() +
                ", surname=" + getSurname() +
                ", numberOfThings=" + getNumberOfThings() +
                '}';
    }
}

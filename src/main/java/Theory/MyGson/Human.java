package Theory.MyGson;

import java.io.Serializable;

/**
 * Created by lapte on 19.07.2016.
 */
public class Human implements Serializable{
    private static final long serialVersionUID = -5176697348566910953L;
    private String firstName;
    transient private String lastName;
    private int age;
    private double iq;
    private String profession;

    public Human(String firstName, String lastName, int age, double iq, String profession) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setIq(iq);
        setProfession(profession);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getIq() {
        return iq;
    }

    public void setIq(double iq) {
        this.iq = iq;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", iq=" + iq +
                ", profession='" + profession + '\'' +
                '}';
    }
}

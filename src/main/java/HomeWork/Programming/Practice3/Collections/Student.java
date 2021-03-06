package HomeWork.Programming.Practice3.Collections;

/**
 * Created by lapte on 16.07.2016.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int course;

    public Student(String firstName, String lastName, int course) {
        setFirstName(firstName);
        setLastName(lastName);
        setCourse(course);
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                '}';
    }
}


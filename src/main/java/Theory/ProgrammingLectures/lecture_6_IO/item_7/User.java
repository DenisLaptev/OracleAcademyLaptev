package Theory.ProgrammingLectures.lecture_6_IO.item_7;

/**
 * Created by Kovantonlenko on 12/1/2015.
 */
public class User extends Parent { //RE exception "No valid parent's constructor, ������ ��� �������� �� �������������� Serializable"
    private int age;
    private String name;
    private String field= "NEW";
    private Test test; // NotSerializableException
    private transient String password;
    private static String example = "example"; // ������ ����� �������� ������� ����������� � ������

    private static final long serialVersionUID = 100l;

    public User(long id, int age, String name, String password, Test test) {
        super(id);
        this.age = age;
        this.name = name;
        this.password = password;
        this.test = test;
    }


    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", nameqwe='" + name + '\'' +
                ", field='" + field + '\'' +
                ", test=" + test +
                ", password='" + password + '\'' +
                '}';
    }
}

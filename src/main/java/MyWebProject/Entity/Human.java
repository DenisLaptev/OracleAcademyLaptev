package MyWebProject.Entity;

import java.util.Date;
import java.util.List;

/**
 * Created by lapte on 16.06.2016.
 */
public class Human {
    private long id;
    private String FirstName;
    private String LastName;
    private Date BirthDay;
    private String email;
    private String login;
    private String password;
    private String address;
    private HumanRole role;
    private List<Product> productsOfUser;

    public Human() {

    }


    enum HumanRole {
        ADMIN, USER
    }


    public Human(long id, String firstName,
                 String lastName, Date birthDay,
                 String email, String login,
                 String password, String address,
                 HumanRole role, List<Product> productsOfUser) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setBirthDay(birthDay);
        setEmail(email);
        setLogin(login);
        setPassword(password);
        setAddress(address);
        setRole(role);
        setProductsOfUser(productsOfUser);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(Date birthDay) {
        BirthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public HumanRole getRole() {
        return role;
    }

    public void setRole(HumanRole role) {
        this.role = role;
    }

    public List<Product> getProductsOfUser() {
        return productsOfUser;
    }

    public void setProductsOfUser(List<Product> productsOfUser) {
        this.productsOfUser = productsOfUser;
    }
}


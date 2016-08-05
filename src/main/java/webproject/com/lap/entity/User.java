package webproject.com.lap.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovantonlenko on 6/16/2016.
 */
public class User {
    private Long id;
    private String name;
    private String secondName;
    private String age;
    private String email;
    private String login;
    private String password;
    private Role role;
    private List<Product> listOfUserProducts = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Product> getListOfUserProducts() {
        return listOfUserProducts;
    }

    public void setListOfUserProducts(List<Product> listOfUserProducts) {
        this.listOfUserProducts = listOfUserProducts;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", listOfUserProducts=" + listOfUserProducts +
                '}';
    }
}

package com.kov.dto;

/**
 * Created by Kovantonlenko on 6/16/2016.
 */
public class UserDto {
    private Long id;
    private String firstName;
    private String age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

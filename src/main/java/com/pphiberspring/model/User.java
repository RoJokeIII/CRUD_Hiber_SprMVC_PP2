package com.pphiberspring.model;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(min = 2, max = 15, message = "Имя должно быть от 2 до 15 символов.")
    @Pattern(regexp="[А-ЯA-Z][а-яa-z]*", message = "Имя должно начинаться с заглавной буквы и не допускать лишних символов.")
    @Column(name = "name")
    private String name;

    @Size(min = 2, max = 15, message = "Фамилия должна быть от 2 до 15 символов.")
    @Pattern(regexp="[А-ЯA-Z][а-яa-z]*", message = "Фамилия должна начинаться с заглавной буквы и не допускать лишних символов.")
    @Column(name = "last_name")
    private String lastName;


    public User() {
    }

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

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
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


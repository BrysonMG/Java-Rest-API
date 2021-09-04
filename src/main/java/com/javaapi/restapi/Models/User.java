package com.javaapi.restapi.Models;

import javax.persistence.*;

//@Entity will tell MySQL that this will be a table in the DB
@Entity
public class User {

    //@Id tells it that this property will be a primary key and
    //@GeneratedValue means that it will assign a value for new entries to the table
    @Id
    @GeneratedValue
    private int id;
    //Each of these '@Column's means that these properties will be a column in this table.
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private int age;
    @Column
    private String occupation;

    //Getters and Setters have to be declared separately. You can't do { get; set; } like you could in C#.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}

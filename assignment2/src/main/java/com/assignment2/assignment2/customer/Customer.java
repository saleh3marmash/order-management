package com.assignment2.assignment2.customer;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Customer {
    public Customer(){
    }
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(columnDefinition = "TINYTEXT")
    String firstName;
    @Column(columnDefinition = "TINYTEXT")
    String lastName;
    LocalDate bornAt;
    public Customer(int id, String firstName, String lastName, LocalDate bornAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornAt = bornAt;
    }
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
    public LocalDate getBornAt() {
        return bornAt;
    }
    public void setBornAt(LocalDate bornAt) {
        this.bornAt = bornAt;
    }
}
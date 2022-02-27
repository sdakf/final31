package com.sda.final31.excercises.others;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Customer {
    private final Long id;
    private final String firstName;
    private final String surname;
    private final int age;
    private final BigDecimal salary;
    public static Long counter;

    { //blok inicjalizujący - odpali się przy każdym utworzeniu obiektu
        this.id = counter++;
    }

    public Customer(String firstName, String surname, int age, String salary) {
//        this.id = counter++;
//        this.firstName = firstName;
//        this.surname = surname;
//        this.age = age;
//        this.salary = BigDecimal.valueOf(Double.valueOf(salary));
        this(firstName, surname, age, Integer.valueOf(salary));
    }

    public Customer(String firstName, String surname, int age, int salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.salary = BigDecimal.valueOf(salary);
    }
}

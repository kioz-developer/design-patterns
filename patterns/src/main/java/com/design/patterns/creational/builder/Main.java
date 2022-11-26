package com.design.patterns.creational.builder;

import java.time.LocalDate;

public class Main {

    // https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java
    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(2001, 05, 15);

        // Employee with age
        Employee anakin = new Employee.Builder("Anakin", dateOfBirth)
                .age(21)
                .build();

        System.out.println(anakin);

        // Employee without age (optional)
        Employee peter = new Employee.Builder("Peter", dateOfBirth)
                .build();

        System.out.println(peter);
    }
}

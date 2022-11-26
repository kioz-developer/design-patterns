package com.design.patterns.creational.builder;

import java.time.LocalDate;

public class Employee {

    private final String name;
    private final Integer age;
    private final LocalDate dateOfBirth;

    // The scope of the constructor has been changed to private,
    // so that it cannot be accessed from the outside of the class.
    private Employee(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.dateOfBirth = builder.dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("Employee [name=%s, age=%d, dateOfBirth=%s]", name, age, dateOfBirth);
    }

    public static class Builder {

        private final String name;
        private Integer age;
        private final LocalDate dateOfBirth;

        public Builder(String name, LocalDate dateOfBirth) {
            this.name = name;
            this.dateOfBirth = dateOfBirth;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee(this);
            validateEmployeeObject(employee);

            return employee;
        }

        private void validateEmployeeObject(Employee employee) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
    }
}


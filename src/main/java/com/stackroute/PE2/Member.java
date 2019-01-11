/**
 * a class named Member with Name, age, Salary as its variable,
 * write an other class named Member Variable that creates an instance
 * of the Member class, initialises its member variables, and then
 * displays the value of each member variable.
 * Output:
 * Members Name: Harry Potter
 * Members Age: 30
 * Members Salary: 2500.3
 */
package com.stackroute.PE2;

public class Member {
    /*Member Variables */
   private String name;
   private int age;
   private double salary;

   /*Getter and Setter*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

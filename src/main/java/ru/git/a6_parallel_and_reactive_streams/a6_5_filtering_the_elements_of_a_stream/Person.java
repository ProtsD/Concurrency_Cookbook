package ru.git.a6_parallel_and_reactive_streams.a6_5_filtering_the_elements_of_a_stream;

import java.util.Comparator;
import java.util.Date;

public class Person implements Comparable<Person> {
    private int id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int salary;
    private double coeficient;

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(double coeficient) {
        this.coeficient = coeficient;
    }

    public int compareTo(ru.git.a6_parallel_and_reactive_streams.a6_3_collecting_the_elements_of_a_stream.Person otherPerson) {
        int compareLastNames = this.getLastName().compareTo(otherPerson.getLastName());
        if (compareLastNames != 0) {
            return compareLastNames;
        } else {
            return this.getFirstName().compareTo
                    (otherPerson.getFirstName());
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    private static Comparator<Person> comparator = Comparator
            .comparing(Person::getLastName)
            .thenComparing(Person::getFirstName);

    @Override
    public int compareTo(Person otherPerson) {
        return comparator.compare(this, otherPerson);
    }

    @Override
    public boolean equals(Object object) {
        return this.compareTo((Person) object) == 0;
    }

    public int hashCode() {
        String sequence = this.getLastName() + this.getFirstName();
        return sequence.hashCode();
    }
}

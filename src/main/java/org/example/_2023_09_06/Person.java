package org.example._2023_09_06;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    //p1.compareTo(p1)
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}

class Main11 {
    public static void main(String[] args) {
        Person p1 = new Person("Nik", 25, 7850);
        Person p2 = new Person("Mik", 21, 11156);
        Person p3 = new Person("Olga", 31, 2580);
        Person p4 = new Person("Masha", 42, 452);

        Person[] people = {p1, p2, p3, p4};
        System.out.println(Arrays.toString(people));

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
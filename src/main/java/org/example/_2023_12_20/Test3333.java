//package org.example._2023_12_20;
//
//public class Test3333 {
//    public static void main(String[] args) {
//        new Person().age = 88;
//    }
//}
//
//@Table(name = "person")
//class Person {
//    int id;
//    String name;
//    int age;
//
//    @OneToMany
//    @JoinColumn(name = "car_id", ref = "car(id)")
//    List<Car> car;
//}
//@Table(name = "car")
//class Car {
//    int id;
//    String model;
//
//    @ManyToOne(mappedBy = "person")
//    Person person;
//}
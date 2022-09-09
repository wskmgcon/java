package com.capgemini.in;

class Student
{
    String name;
    int age;
    double marks;
    public Student(String name, int age, double marks) {
        super();
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
    }

}
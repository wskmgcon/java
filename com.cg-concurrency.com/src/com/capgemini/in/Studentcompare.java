package com.capgemini.in;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class Studentcompare implements Comparable<Studentcompare>
{
    String name;
    int age;
    double marks;
    public Studentcompare(String name, int age, double marks) {
        super();
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
    }
    @Override
    public int compareTo(Studentcompare o) {
        // TODO Auto-generated method stub
        if (marks>o.marks)
            return 1;
        else if(marks<o.marks)
            return -1;
        else
            return 0;

    }


}
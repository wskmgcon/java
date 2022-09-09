package com.capgemini.in;

import java.util.Comparator;
import java.util.Iterator;

public class Studentmulticompare
{
    String name;
    int age;
    double marks;
    public Studentmulticompare(String name, int age, double marks) {
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

class MarksComparator implements Comparator<Studentmulticompare>
{

    @Override
    public int compare(Studentmulticompare o1, Studentmulticompare o2) {

        if(o1.marks>o2.marks)
        {
            return 1;
        }
        else if(o1.marks<o2.marks)
            return -1;
        else

            return 0;
    }



}
class NameComparator implements Comparator<Studentmulticompare>
{

    @Override
    public int compare(Studentmulticompare o1, Studentmulticompare o2) {
        // TODO Auto-generated method stub
        return o1.name.compareTo(o2.name);
    }




    }



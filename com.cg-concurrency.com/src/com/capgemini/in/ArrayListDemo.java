package com.capgemini.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

    public class ArrayListDemo {

        public static void main(String[] args) {

            ArrayList al = new ArrayList();
            al.add("Apple");
            al.add(56);
            al.add(null);

            al.add(67.89);
            al.add(56);
            System.out.println(al);
            Iterator itr = al.iterator();

            while (itr.hasNext()) {

                System.out.println(itr.next());

            }

            //class student
            System.out.println("Class Student \n");
            ArrayList<Student> a1 = new ArrayList<Student>();
            a1.add(new Student("Karthik",23,90));
            a1.add(new Student("Krishna",27,70));
            a1.add(new Student("Shiva",29,78));


            System.out.println(al);
            Iterator<Student> itr1 = a1.iterator();
            while(itr1.hasNext())
            {
                System.out.println(itr1.next());
            }


            for(Student s:a1)
            {
                System.out.println(s);
            }
//class Studentcompare
            System.out.println(("Student Compare class \n"));
                    // TODO Auto-generated method stub
                    ArrayList<Studentcompare> a2 = new ArrayList<Studentcompare>();
                    a2.add(new Studentcompare("Karthik",23,90));
                    a2.add(new Studentcompare("Krishna",27,70));
                    a2.add(new Studentcompare("Shiva",29,78));


                    System.out.println(al);
                    Iterator<Studentcompare> itr2 = a2.iterator();
                    System.out.println("student list before sorting\n");
                    while(itr2.hasNext())
                    {
                        System.out.println(itr2.next());
                    }

                    Collections.sort(a2);
                    System.out.println("Student list after sorting\n");
                    for(Studentcompare s:a2)
                    {
                        System.out.println(s);
                    }
// Student MultiCOmpare
System.out.println("Student Multicompare\n");
            ArrayList<Studentmulticompare> a3 = new ArrayList<Studentmulticompare>();
            a3.add(new Studentmulticompare("Karthik",23,90));
            a3.add(new Studentmulticompare("Krishna",27,70));
            a3.add(new Studentmulticompare("Shiva",29,78));
            a3.add(new Studentmulticompare("Arya",27,45));
            a3.add(new Studentmulticompare("Binot",29,60));

            System.out.println(a3);
            Iterator<Studentmulticompare> itr3 = a3.iterator();
            System.out.println("student list before sorting\n");
            while(itr3.hasNext())
            {
                System.out.println(itr3.next());
            }
            System.out.println("Student list after sorting in the Increasing order of marks\n");
            Collections.sort(a3,new MarksComparator());

            for(Studentmulticompare s:a3)
            {
                System.out.println(s);
            }

            System.out.println("Student list after sorting Names");

            Collections.sort(a3,new NameComparator());
            for(Studentmulticompare s:a3)
            {
                System.out.println(s);
            }


            ArrayList<Studentmulticompare> a4 = new ArrayList<Studentmulticompare>();
            a4.add(new Studentmulticompare("Karthik",23,90));
            a4.add(new Studentmulticompare("Krishna",27,70));
            a4.add(new Studentmulticompare("Shiva",29,78));
            a4.add(new Studentmulticompare("Arya",27,45));
            a4.add(new Studentmulticompare("Binot",29,60));

            System.out.println(a4);
            Iterator<Studentmulticompare> itr4 = a4.iterator();
            System.out.println("student list before sorting");
            while(itr4.hasNext())
            {
                System.out.println(itr4.next());
            }
            System.out.println("Student list after sorting in the Increasing order of marks");
            Collections.sort(a4,new MarksComparator());

            for(Studentmulticompare s:a4)
            {
                System.out.println(s);
            }

            System.out.println("Student list after sorting Names");

            Collections.sort(a4,new NameComparator());
            for(Studentmulticompare s:a4)
            {
                System.out.println(s);
            }
                }
    }




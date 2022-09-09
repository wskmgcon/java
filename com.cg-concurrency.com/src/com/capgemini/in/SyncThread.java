package com.capgemini.in;


    class Display

    {

        public   void sayGreetings(String name) throws InterruptedException

        {

            synchronized(this)

            {

                for(int i=1;i<=10;i++)

                {

                    System.out.println("goodEvening");

                    Thread.sleep(500);

                    System.out.println(name);

                }

            }

        }

    }

    class FirstThread extends Thread

    {

        Display d;

        String name;

        FirstThread(Display d,String name)

        {

            this.d = d;

            this.name = name;

        }

        public void run()

        {

            try {

                d.sayGreetings(name);

            } catch (InterruptedException e) {

                // TODO Auto-generated catch block

                e.printStackTrace();

            }

        }

    }

    class SecondThread extends Thread

    {



        Display d;

        String name;

        SecondThread(Display d,String name)

        {

            this.d = d;

            this.name = name;

        }

        public void run()

        {

            try {

                d.sayGreetings(name);

            } catch (InterruptedException e) {

                // TODO Auto-generated catch block

                e.printStackTrace();

            }

        }



    }



    public class SyncThread {



        public static void main(String[] args) {


            Display d = new Display();

            FirstThread t1 = new FirstThread(d,"karthik");

            t1.start();

            SecondThread t2 = new SecondThread(d,"Krishna");



            t2.start();



        }



    }


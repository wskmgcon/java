class parent {

    String name;
    int rollno;

    public parent(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
        System.out.println("inside parent constructor");
    }
   public String parentmethod()
    {
        System.out.println("inside paprent parent method");
        return "0";
    }

}

public class child extends parent
{

        public child(String name, int rollno)
        {
            super(name, rollno);


            System.out.println("inside child constructor");
        }

        @Override
        public String parentmethod() {

            System.out.println("overriding parent method in child");
           //  super.parentmethod();
             return "nil";
        }

        public static void main(String[] args) {
          //  child c=new child("rohan",1);
            child c=new child("rohit",2);
            parent p=new parent("rohan",2);

            c.parentmethod();
            p.parentmethod();
            p=c;
            p.parentmethod();
        }
    }

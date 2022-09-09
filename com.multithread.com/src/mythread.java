public class mythread extends Thread {


        public void run(){
            System.out.println("Now, inside the run method");
            for(int i=0;i<5;i++)
            {
                System.out.println("Executing  "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        public static void main(String[]args) throws InterruptedException {
            mythread t1 = new mythread();
            mythread t2 = new mythread();
            t1.start();
            try{
                t1.join();
            }catch(Exception e){System.out.println(e);}

            t2.start();

 System.out.println("The thread priority of first thread is : " + t1.getPriority());
            System.out.println("The thread priority of second thread is : " +       t2.getPriority());
            t1.setPriority(9);
            t2.setPriority(1);

            System.out.println("The thread priority of first thread is : " +    t1.getPriority());
            System.out.println("The thread priority of second thread is : " + t2.getPriority());

            System.out.println(Thread.currentThread().getName());
            System.out.println("The thread priority of main thread is : " +
                    Thread.currentThread().getPriority());
            Thread.currentThread().setPriority(10);
            System.out.println("The thread priority of main thread is : " +
                    Thread.currentThread().getPriority());
        }
    }


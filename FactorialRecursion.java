import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FactorialRecursion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Factorial No : ");
        int num=sc.nextInt();
    Factorial fact=new Factorial();
    int Val=fact.calculateFactorial(num);
        System.out.println("Fact  :"+Val);
    }
    public static class Factorial{

        public int calculateFactorial(int num) {

            if(num==1) {
                return 1;
            }
            return num * calculateFactorial(num - 1);
        }


    }
}
import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class student
{
    String name;int marks;

    public student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class funcinter {
    public static void main(String[] args) {
        Consumer<student> c = s -> {
            System.out.println(s.marks);
            System.out.println(s.name);
        };
//c.accept(c);
        Function<Integer, Integer> func = i -> i * i;
        System.out.println(func.apply(4));

        Function<student, Integer> func1 = s -> {
            int marks = s.marks;
            if (marks >= 90)
                System.out.println("Grade A");
            else if (marks > 70 && marks < 90)
                System.out.println("Grade B");
            return marks;
        };
        student s = new student("raj", 71);
        func1.apply(s);


        Predicate<student> p = s1 -> s1.marks > 90;
        System.out.println("Predicate  " + p.test(s));

        Function<Integer, Integer> func3 = i -> i * i;
        Function<Integer, Integer> func4 = i -> 3 * i;
        System.out.println("2 Functions club " + func3.andThen(func4).apply(2));
        System.out.println("2 functions club " + func3.compose(func4).apply(2));

       int a = 10;
         int b = 20;




    }
}

package predicates;

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        //Predicate only takes one parameter and returns a boolean value
        //Use the Predicate Interface only when you have Conditional Statements
        //p is a reference variable, i is the argument passed, -> symbolizes a lambda expression
        //The Predicate Interface has one abstract method which is the test() method
        //It test the condition and returns true or false depending on the condition passed
        Predicate<Integer> p = i -> (i>10);
        System.out.println(p.test(20));

        Predicate<String> pr = s-> (s.length() > 4);
        System.out.println(pr.test("Tafadzwa"));
        System.out.println(pr.test("Ale"));

        //Print array elements whose length is greater than 4
        String names[] = {"John","Mike","Scott","Blessing","Tafadzwa"};
        for(String name : names){
            if(pr.test(name)){
                System.out.println(name);
            }
        }

    }
}

package predicates;

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> (i>10);
        System.out.println(p.test(20));
    }
}

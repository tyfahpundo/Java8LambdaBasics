package functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String name;
    int salary;

    Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }
}
public class Demo {
    public static void main(String[] args) {
        ArrayList<Employee> emplist = new ArrayList<>();
        emplist.add(new Employee("Shelton",15000));
        emplist.add(new Employee("David",50000));
        emplist.add(new Employee("Mary",30000));
        emplist.add(new Employee("Sandra",25000));
        //Calculating the bonuses of every employee depending on their current salaries
        Function<Employee,Integer> fn = e -> {
            int sal = e.salary;
            if(sal>=10000 && sal<=20000){
                return (sal *10/100);
            }else if(sal>30000 && sal<=50000){
                return (sal *30/100);
            }else
                return (sal * 40/100);
        };
        Predicate<Integer> p = b -> b>5000;

        for(Employee emp: emplist){
            int bonus = fn.apply(emp);

            if(p.test(bonus)){
                System.out.println(emp.name+" "+emp.salary);
                System.out.println("The bonus is: "+bonus);
            }
        }
    }
}

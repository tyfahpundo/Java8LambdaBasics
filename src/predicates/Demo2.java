package predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    public String name;
    public int salary;
    public int experience;

    public Employee(String name, int salary,int experience){
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Tafadzwa",50000,7);
        int a[] = {2,6,5,15,10,50,76,77,82,90,23,45,55};
        //I want an employee whose salary is> 30k and experience > 3
        Predicate<Integer> p1 = i -> i%2==0;
        Predicate<Integer> p2 = i -> i>50;

        Predicate<Employee> em = e -> (e.salary > 30000 && e.experience > 3);

        System.out.println(em.test(emp));
        //I want the same result but of multiple objects
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Blessing",35000,6));
        al.add(new Employee("Kelvin",55000,7));
        al.add(new Employee("Sylvester",25000,8));
        al.add(new Employee("Tynoe",3000,1));
        al.add(new Employee("Allen",75000,5));

        for(Employee e: al){
            if(em.test(e)){
                System.out.println(e.name+" "+"$"+e.salary+" "+e.experience+"years experience");
            }
        }
        for(int b: a){
            if(p1.and(p2).test(b)){
                System.out.println(b);
            }
        }
    }
}

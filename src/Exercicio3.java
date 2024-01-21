import Models.Employee;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {

        Set<Employee> employees = new HashSet<>();

        int employeess;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("how many employees will be registered? ");
        employeess = Integer.parseInt(sc1.next());
        for(int i= 1;i<=employeess;i++){
            System.out.println("Employee #"+i+":");
            System.out.println("Id: ");
            Integer id = sc1.nextInt();
            System.out.println("Name: ");
            String name = sc1.next();
            System.out.println("Salary: ");
            Double salary = sc1.nextDouble();
            Employee emp = new Employee(id,name,salary);
            employees.add(emp);
        }
        System.out.println("wich employee ID you want do increase salary: ");
        int employeechosen = sc1.nextInt();
        for (Employee em:employees) {
            if (employeechosen == em.getId()){
                System.out.println("percentage you want to increase salary: ");
                double percent = sc1.nextDouble();
                em.increaseSalary(percent);
            }
        }

        for (Employee e:employees) {
            System.out.println(e);
        }

    }

}

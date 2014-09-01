package my.myinterface;

import java.util.LinkedList;

/**
 * Created by Timothy on 9/1/2014.
 */
public class Main {

    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<Employee>();
        employees.add(new HourlyEmployee("Bob", "Smith", 7.25));
        employees.add(new SalariedEmployee("Emily", "Long", 40000, 10));
        employees.add(new SalaryPlusCommissionEmployee("George", "Jungle", 40000, 7, 9.8));

        //Pay all employees
        for(Employee e : employees) {
            System.out.println(e.getName() + " will be paid " + e.pay());
        }

    }
}
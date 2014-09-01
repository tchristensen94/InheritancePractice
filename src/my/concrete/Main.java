package my.concrete;

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

        employees.get(1).infraction(5); //5 infractions
        employees.get(2).infraction(); //Single infraction

        //check if employee should be fired
        for(Employee e : employees) {
            if(e.shouldFire()) {
                System.out.println(e.getName() + " should be fired");
            } else {
                System.out.println(e.getName() + " is good to go");
            }
        }

        //Pay all employees
        for(Employee e : employees) {
            System.out.println(e.getName() + " will be paid " + e.pay());
        }

    }
}
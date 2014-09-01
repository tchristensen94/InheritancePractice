package my.concrete;

/**
 * Created by Timothy on 8/29/2014.
 */
public class SalariedEmployee extends Employee{
    private double salary = 0.0;

    public int getVacation() {
        return vacation;
    }

    public double getSalary() {
        return salary;
    }

    private int vacation = 10; //Vacation days left

    public SalariedEmployee(String first, String last, double salary, int vacation) {
        super(first, last);
        this.salary = salary;
        this.vacation = vacation;
    }
    public void goVacation(int days) {
        this.vacation -= days;
    }

    @Override
    public double pay() {
        return salary/26;
    }
}

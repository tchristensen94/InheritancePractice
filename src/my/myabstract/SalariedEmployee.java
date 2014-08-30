package my.myabstract;

/**
 * Created by Timothy on 8/29/2014.
 */
public class SalariedEmployee extends Employee{
    private double salary = 0.0;
    private int vacation = 10; //Vacation days left

    public SalariedEmployee(String first, String last, double salary, int vacation) {
        super(first, last);
        this.salary = salary;
        this.vacation = vacation;
    }

    /**
     *
     * @param days amount of days they are gone on vacations
     */
    public void goVacation(int days) {
        this.vacation -= days;
    }

    /**
     * Makes sure that the employee is able to go on vacation
     * @return true if they can go on vacation
     */
    public boolean canVacation() {
        return vacation > 0;
    }

    public double pay() {
        return salary/26;
    }
}

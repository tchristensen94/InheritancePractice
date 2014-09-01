package my.myinterface;

/**
 * Created by Timothy on 8/29/2014.
 */
public class SalariedEmployee implements Employee{
    private String first;
    private String last;
    private double salary;
    private int vacation;

    public SalariedEmployee(String first, String last, double salary, int vacation) {
        this.first = first;
        this.last = last;
        this.salary = salary;
        this.vacation = vacation;
    }
    @Override
    public double pay() {
        return salary/26;
    }

    public void goVacation(int days) {
        this.vacation -= days;
    }

    @Override
    public String getName() {
        return first + " " + last;
    }
}

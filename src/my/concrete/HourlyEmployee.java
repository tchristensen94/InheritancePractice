package my.concrete;

/**
 * Created by Timothy on 8/29/2014.
 */
public class HourlyEmployee extends Employee {
    private double wage = 7.25;
    private double hours = 0; //Hours worked

    public HourlyEmployee(String first, String last, double wage) {
        super(first, last);
        this.wage = wage;
    }

    public void clockHours(double hours) {
        this.hours += hours;
    }

    /**
     * Function to figure out how much they should be paid
     * @return how much they should be paid
     */
    @Override
    public double pay() {
        return hours*wage;
    }

    /**
     * Resets the hours worked
     */
    public void reset() {
        this.hours = 0;
    }

}

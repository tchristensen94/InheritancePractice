package my.myinterface;

/**
 * Created by Timothy on 8/29/2014.
 */
public class HourlyEmployee implements Employee {
    private String first;
    private String last;
    private double wage = 7.25;
    private double hours = 0; //Hours worked

    public HourlyEmployee(String first, String last, double wage) {
        this.first = first;
        this.last = last;
        this.wage = wage;
    }

    public void clockHours(double hours) {
        this.hours += hours;
    }

    @Override
    public double pay() {
        return hours*wage;
    }
}

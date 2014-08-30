package my.myabstract;

/**
 * Created by Timothy on 8/30/2014.
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {

    private double percentage = 0.0;
    private double commission = 0.0;

    public SalaryPlusCommissionEmployee(String first, String last, double salary, int vacation, double percentage) {
        super(first, last, salary, vacation);
        this.percentage = percentage;
    }

    public void makeSale(double amount) {
        this.commission += amount*percentage;
    }

    @Override
    public double pay() {
        return super.pay() + commission;
    }
}

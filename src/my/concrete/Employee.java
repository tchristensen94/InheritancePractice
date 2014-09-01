package my.concrete;

/**
 *
 * @author Timothy
 */
public class Employee {
    private String first = "";
    private String last = "";
    private int infractions = 0;

    public Employee(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getName() {
        return first + " " + last;
    }

    public double pay() {
        return 0.0;
    };
    public void infraction() {
        infractions++;
    }
    public void infraction(int count) {
        infractions += count;
    }
    public boolean shouldFire() {
        return infractions > 3;
    }
}

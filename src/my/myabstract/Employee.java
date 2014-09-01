package my.myabstract;

/**
 * Created by Timothy on 8/29/2014.
 */
public abstract class Employee {
    private String first;
    private String last;
    private int infractions = 0;

    public String getName() {
        return first + " " + last;
    }

    public Employee(String first, String last) {
        this.first = first;
        this.last = last;

    }

    abstract double pay();

    public void infraction() {
        infractions++;
    }
    public void infraction(int count) {
        infractions += count;
    }

    /**
     * Tells if the employee should be fired.
     * @return true if they have more than 3 infractions
     */
    public boolean shouldFire() {
        return infractions > 3;
    }
}

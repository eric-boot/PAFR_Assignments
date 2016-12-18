package scenario_4.src;

/**
 * Created by Boot on 14-12-16.
 */
public class Main {
    public static void main(String args[]) {
        // raise salary of all employees
        SalarySystem s = new SalarySystem();

        s.printAll();

        Employee e = s.search("Jaap");
        s.raiseSalary(e);

        e = s.search("Fred");
        s.raiseSalary(e);

        e = s.search("Hans");
        s.raiseSalary(e);

        s.printAll();
    }
}

package scenario_4.src;

/**
 * Created by Boot on 14-12-16.
 */
public class Main {
    public static void main(String args[]) {
        // raise salary of all employees
        SalarySystem s = new SalarySystem();
        SalaryFactory salaryFactory = new SalaryFactory();

        s.printAll();

        Employee e = s.search("Jaap");
        salaryFactory.raiseSalary(e);

        e = s.search("Fred");
        salaryFactory.raiseSalary(e);

        e = s.search("Hans");
        salaryFactory.raiseSalary(e);

        s.printAll();
    }
}

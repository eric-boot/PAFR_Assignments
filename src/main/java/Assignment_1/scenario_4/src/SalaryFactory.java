package scenario_4.src;

/**
 * Created by Boot on 17-12-16.
 */
public class SalaryFactory {
    public void raiseSalary(Employee e) {
        // if emp is jr, then he gets 5% raise + 100
        // when emp is mr, he gets 6% + 100
        // when emp is sr, he gets 7%
        switch (e.getKind()) {
            case JUNIOR:
                e.setSalary(e.getSalary() * 105 + 10000);
                e.setSalary(e.getSalary() / 100);
                System.out.println("Log message: employee " + e.getName() + " has new salary: " + e.getSalary());
                break;
            case MEDIOR:
                e.setSalary(e.getSalary() * 106+ 20000);
                e.setSalary(e.getSalary() / 100);
                System.out.println("Log message: employee " + e.getName() + " has new salary: " + e.getSalary());
                break;
            case SENIOR:
                e.setSalary(e.getSalary() * 107);
                e.setSalary(e.getSalary() / 100);
                System.out.println("Log message: employee " + e.getName() + " has new salary: " + e.getSalary());
                break;
        }
    }
}

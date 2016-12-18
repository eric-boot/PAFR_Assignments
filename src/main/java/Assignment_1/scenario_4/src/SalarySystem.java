package scenario_4.src;

import java.util.ArrayList;

import static scenario_4.src.KindOfEmployee.*;


public class SalarySystem {

	private ArrayList empArray = new ArrayList();
	private SalaryFactory salaryFactory = new SalaryFactory();

	public SalarySystem() {
		Employee j = new Employee("Jaap", JUNIOR);
		Employee m = new Employee("Fred", MEDIOR);
		Employee s = new Employee("Hans", SENIOR);
		j.setSalary(1700.0);
		m.setSalary(2000);
		s.setSalary(2300);
		addColleague(j);
		addColleague(m);
		addColleague(s);
	}

	public void addColleague(Employee c) {
		empArray.add(c);
	}

	public Employee search(String s) {
		for (int i = 0; i < empArray.size(); i++)
			if (((Employee)empArray.get(i)).getName().equals(s)) return (Employee)empArray.get(i);
		return new Employee("no employee has been found", NULL);
	}

    public void raiseSalary(Employee e) {
        salaryFactory.raiseSalary(e);
    }

	public void printAll() {
		for (Object e : empArray) {
			Employee e1 = (Employee)e;
			System.out.print(e.toString() + "\n");
		}
	}

}



package scenario_4.src;

import static scenario_4.src.KindOfEmployee.JUNIOR;

public class Employee {
	private KindOfEmployee k;
	private String name;
	private double sal;
	
	public Employee() {
		this.k = JUNIOR;
		this.name = "";
		this.sal = 0.0;
	}
	
	public Employee(String n, KindOfEmployee kindOfEmployee) {
		name = n;
		this.k = kindOfEmployee;
	}
	
	public String getName() {
		return name;
	}
	
	public KindOfEmployee getKind() {
		return k;
	}

    public void setKind(KindOfEmployee k) {this.k = k; }

	public double getSalary() {
		return sal;
	}

    public void setSalary(double s) {
        this.sal = s;
    }

    public String toString() {
		String r = k + " employee " + name + " has salary " + sal;
		return r;
	}

}

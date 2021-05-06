
public class Instructor extends User {
	private int salary;

	public Instructor(int id, String firstName, String lastName, String email, String password, int salary) {
		super(id, firstName, lastName, email, password);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

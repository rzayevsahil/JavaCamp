
public class Student extends User {
	private int studentNumber;

	public Student(int id, String firstName, String lastName, String email, String password, int studentNumber) {
		super(id, firstName, lastName, email, password);
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
}

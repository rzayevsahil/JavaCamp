
public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "engindemirog@gmail.com", "*****", 2000);
		Student student = new Student(1, "Sahil", "Rzayev", "sahilrzayev@gmail.com", "*****", 111222);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.update(instructor);
		instructorManager.delete(instructor);

		System.out.println("----------------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.update(student);
		studentManager.delete(student);
	}

}


public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.id = 1;
		instructor1.name = "Engin";
		instructor1.surName = "Demiro�";

		Instructor instructor2 = new Instructor(1, "Kerem", "Var��");

		Course course1 = new Course();
		course1.id = 1;
		course1.name = "Java + React";
		course1.instructor = "Engin Demiro�";

		Course course2 = new Course(2, "C# + Angular", "Engin Demiro�");
		
		
		
		Course[] courses= {course1,course2};
		Instructor[] instructors= {instructor1,instructor2};
		
		System.out.println("----- E�itmenler -----");
		for (Instructor instructor : instructors) {
			System.out.println(instructor.id + "." + instructor.name + " " + instructor.surName);
		}
		
		System.out.println();
		
		System.out.println("----- E�itimler -----");
		for (Course course : courses) {
			System.out.println(course.id + "." + course.name + " - " + course.instructor);
		}
		
		System.out.println();
		
		System.out.println("----- ��lemler -----");
		
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course2);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor2);
	}

}

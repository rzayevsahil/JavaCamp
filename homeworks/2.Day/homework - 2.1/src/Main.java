
public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.id = 1;
		instructor1.name = "Engin";
		instructor1.surName = "Demiroð";

		Instructor instructor2 = new Instructor(1, "Kerem", "Varýþ");

		Course course1 = new Course();
		course1.id = 1;
		course1.name = "Java + React";
		course1.instructor = "Engin Demiroð";

		Course course2 = new Course(2, "C# + Angular", "Engin Demiroð");
		
		
		
		Course[] courses= {course1,course2};
		Instructor[] instructors= {instructor1,instructor2};
		
		System.out.println("----- Eðitmenler -----");
		for (Instructor instructor : instructors) {
			System.out.println(instructor.id + "." + instructor.name + " " + instructor.surName);
		}
		
		System.out.println();
		
		System.out.println("----- Eðitimler -----");
		for (Course course : courses) {
			System.out.println(course.id + "." + course.name + " - " + course.instructor);
		}
		
		System.out.println();
		
		System.out.println("----- Ýþlemler -----");
		
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course2);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor2);
	}

}

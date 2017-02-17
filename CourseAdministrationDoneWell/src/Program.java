
public class Program {
	
	public static void main(String[] args) {
		p("Welcome to the course administration program.");
		p("---------------------------------------------");
		p("");
		
		p("Creating two courses...");
		Course courseA = new Course("First Course");
		Course courseB = new Course("Second Course");
		
		p("- courseA ID is: " +courseA.id);
		p("- courseA name is: " +courseA.getName());
		p("- courseB ID is " +courseB.id);
		p("- CourseB name is: " +courseB.getName());
		
		p("Creating two students...");
		Student student1 = new Student("John", "Conley");
		Student student2 = new Student("Sophie", "Neveu");
		
		p("- student1 ID is: " +student1.Id);
		p("- student1 name is: " student.getFirstName() + ", " + student1.getLastName());
		p("- student2 ID is: " +student2.Id);
		p("- student2 name is: " student.getFirstName() + ", " + student2.getLastName());
		
		p("");
		
		p("Registering for courses...");
		student1.registerForCourse(CourseA);
		student2.registerForCourse(CourseB);
		courseA.registerStudent(student2);
		
		p("- courseA number of students: " + courseA.nrOfRegisteredStudents());
		p("- courseB number of students: " +courseB.nrOfRegisteredStudents());
		
	}
	
	static void p(String 1) {
		System.out.println(1);
	}
}

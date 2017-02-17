
public class Program {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the course administration program.");
		System.out.println("---------------------------------------------");
		System.out.println("");
		
		System.out.println("Creating two courses...");
		Course courseA = new Course("First Course");
		Course courseB = new Course("Second Course");
		
		System.out.println("- courseA ID is: " +courseA.id);
		System.out.println("- courseA name is: " +courseA.getName());
		System.out.println("- courseB ID is " +courseB.id);
		System.out.println("- CourseB name is: " +courseB.getName());
		
		System.out.println("Creating two students...");
		Student student1 = new Student("John", "Conley");
		Student student2 = new Student("Sophie", "Neveu");
		
		System.out.println("- student1 ID is: " +student1.id);
		System.out.println("- student1 name is: " +student1.getLastName() + ", " + student1.getFirstName());
		System.out.println("- student2 ID is: " +student2.id);
		System.out.println("- student2 name is: " +student2.getLastName() + ", " + student2.getFirstName());
		
		System.out.println("");
		
		System.out.println("Registering for courses...");
		student1.registerForCourse(courseA);
		student2.registerForCourse(courseB);
		courseA.registerStudent(student2);
		
		System.out.println("- courseA number of students: " + courseA.nrOfRegisteredStudents());
		System.out.println("- courseB number of students: " +courseB.nrOfRegisteredStudents());
		
	}
	
	
}
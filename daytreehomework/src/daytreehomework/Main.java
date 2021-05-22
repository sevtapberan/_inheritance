package daytreehomework;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.depertment = "Bilgisayar Mühendisi ";
		student.firstName = "Sevtap";
		student.lastName = "Beran";

		Instructor instructor = new Instructor();
		instructor.firstName = "Serap";
		instructor.branch = "Elektrik Mühendisi";
		instructor.lecture = "Sinyaller ve sistemler";

		UserManager userManager = new UserManager();
		User[] user = { student, instructor };
		userManager.addUser(instructor);
		userManager.addUser(student);

		StudentManager studentManager = new StudentManager();
		studentManager.update(student);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.lectureChoose(instructor);

	}

}

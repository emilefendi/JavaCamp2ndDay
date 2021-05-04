package javaCamp2ndDayExercise;

public class MainClass {

	public static void main(String[] args) {
		Course camp1 = new Course(1,"'Java*React Kampi'","Engin Demirog");
		Course camp2 = new Course(2, "'Matematik'", "Hamit Altintop");
		Student student1 = new Student();
		student1.setStudentId(1);
		student1.setStudentName("Taha Akgul");
		
		Student student2 = new Student();
		student2.setStudentId(2);
		student2.setStudentName("Kerim Koparan");
		
		CourseManager admin = new CourseManager();
		admin.register(student1, camp1);
		admin.register(student2, camp2);
		
	}

}

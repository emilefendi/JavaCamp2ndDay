package javaCamp2ndDayExercise;

public class CourseManager {
	public void register(Student student,Course course) {
		System.out.println(student.getStudentId()+". id numarali "+student.getStudentName()+" "+
	course.mentorName+" Adli hocanin "+course.courseId+" numarali "+course.courseName
	+" kursuna kayd olmusdur!");
	}
}

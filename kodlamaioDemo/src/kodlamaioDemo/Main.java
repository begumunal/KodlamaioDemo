package kodlamaioDemo;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setStudentNumber(10);
		student.getId();
		
		Instructor �nstructor=new Instructor();
		�nstructor.getEmail();
		�nstructor.setLesson("Angular");
		
		StudentManager studentManager=new StudentManager();
		studentManager.lessonAdd("Java");
		studentManager.homeworkSend();
		
		InstructorManager �nstructorManager=new InstructorManager();
		�nstructorManager.lessonDelete("c#");
		�nstructorManager.homeworkUpload();
	}

}

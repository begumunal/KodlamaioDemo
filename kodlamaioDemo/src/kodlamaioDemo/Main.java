package kodlamaioDemo;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setStudentNumber(10);
		student.getId();
		
		Instructor ýnstructor=new Instructor();
		ýnstructor.getEmail();
		ýnstructor.setLesson("Angular");
		
		StudentManager studentManager=new StudentManager();
		studentManager.lessonAdd("Java");
		studentManager.homeworkSend();
		
		InstructorManager ýnstructorManager=new InstructorManager();
		ýnstructorManager.lessonDelete("c#");
		ýnstructorManager.homeworkUpload();
	}

}

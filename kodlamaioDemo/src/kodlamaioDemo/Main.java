package kodlamaioDemo;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setStudentNumber(10);
		student.getId();
		
		Instructor żnstructor=new Instructor();
		żnstructor.getEmail();
		żnstructor.setLesson("Angular");
		
		StudentManager studentManager=new StudentManager();
		studentManager.lessonAdd("Java");
		studentManager.homeworkSend();
		
		InstructorManager żnstructorManager=new InstructorManager();
		żnstructorManager.lessonDelete("c#");
		żnstructorManager.homeworkUpload();
	}

}

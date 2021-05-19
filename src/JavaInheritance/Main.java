package JavaInheritance;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, "Yasemin", "DOĞAN", "yase@gmail.com", "12345", "JAVA");
		Instructure instructure = new Instructure(2, "Engin", "DEMİROĞ", "engin@gmail.com", "98765",  "Java-C#-Python");
		User user = new User();
		
		
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		UserManager userManager = new UserManager();
		
		studentManager.YorumEkle(student);
		studentManager.UpdateLesson(student);
		instructorManager.YeniKursEkle(instructure);
		instructorManager.SifreGuncelle(user);
		userManager.YorumEkle(instructure);

	}

}

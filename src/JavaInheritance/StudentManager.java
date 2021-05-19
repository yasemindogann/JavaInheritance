package JavaInheritance;

public class StudentManager extends UserManager{
	
	public void UpdateLesson(Student student) {
		System.out.println("Dersler Güncellendi.." + "Öğrencimiz "+ student.getFirstName());
	}

}

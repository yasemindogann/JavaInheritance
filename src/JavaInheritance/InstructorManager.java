package JavaInheritance;

public class InstructorManager extends UserManager {
	
	public void YeniKursEkle(Instructure instructure) {
		System.out.println(instructure.getFirstName() + " " + instructure.getLastName()+" Adına Yeni Kurs Eklendi..");
	}

}

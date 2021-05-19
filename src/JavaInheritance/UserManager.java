package JavaInheritance;

public class UserManager {
	
	public void YorumEkle(Student student) {
		System.out.println(student.getFirstName()+ " " +student.getLastName() + " Yeni Yorum Ekledi..");
	}
	
	public void YorumEkle(Instructure instructure) {
		System.out.println(instructure.getFirstName()+ " " +instructure.getLastName() + " Yeni Yorum Ekledi..");
	}
	
	public void SifreGuncelle(User user) {
		System.out.println("Sifre Güncellendi..");
	}

}

package JavaInheritance;

public class Student extends User {
	
	private String alinanDersler;

	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int id, String firstName, String lastName, String email, String sifre, String alinanDersler) {
		super(id, firstName, lastName, email, sifre);
		this.alinanDersler = alinanDersler;
	}

	
	
	
}

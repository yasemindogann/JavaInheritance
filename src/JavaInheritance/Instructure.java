package JavaInheritance;

public class Instructure extends User {
	
	private String verilenDersler;
	
	
	
	public Instructure() {
		// TODO Auto-generated constructor stub
	}

	public Instructure(int id, String firstName, String lastName, String email, String sifre, String verilenDersler) {
		super(id, firstName, lastName, email, sifre);
		this.verilenDersler = verilenDersler;
	}

	public String getVerilenDersler() {
		return verilenDersler;
	}

	public void setVerilenDersler(String verilenDersler) {
		this.verilenDersler = verilenDersler;
	}
	
	
}

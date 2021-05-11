package chainOfResponsibility.clase;

public class Client {
	private String nume;
	private String tel;
	private String email;
	
	public Client(String nume, String tel, String email) {
		super();
		this.nume = nume;
		this.tel = tel;
		this.email = email;
	}
	
	public String getNume() {
		return nume;
	}
	public String getTel() {
		return tel;
	}
	public String getEmail() {
		return email;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

package ro.ase.cts.chainOfResponsibility.clase;

public class Client {
	private String nume;
	private String telefon;
	private String email;
	public String getNume() {
		return nume;
	}
	public String getTelefon() {
		return telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Client(String nume, String telefon, String email) {
		super();
		this.nume = nume;
		this.telefon = telefon;
		this.email = email;
	}
}

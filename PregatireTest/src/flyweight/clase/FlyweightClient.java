package flyweight.clase;

public class FlyweightClient implements IFlyweightClient{
	private String nume;
	private String nrTelefon;
	private String email;

	public FlyweightClient(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}
	

	public void setNume(String nume) {
		this.nume = nume;
	}


	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FlyweightClient [nume=");
		builder.append(nume);
		builder.append(", nrTelefon=");
		builder.append(nrTelefon);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void printeazaRezervare(Rezervare rezervare) {
		System.out.println("Rezervarea: " + rezervare.toString() + "\npentru clientul: " + this.toString());
	}

}

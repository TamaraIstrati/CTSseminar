package singleton.clase;

public class Generator {
	private int cod;
	private static Generator instance;
	
	public Generator(int cod) {
		super();
		this.cod = cod;
	}
	
	public static synchronized Generator getInstance() {
		if(instance == null) {
			instance = new Generator(0);
		}
		
		return instance;
	}
	
}

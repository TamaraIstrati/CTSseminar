package prototype.clase;

public class SubstantaActiva implements PrototipClonare{
	
	private String nume;
	private int masaAtimicRelativa;

	public SubstantaActiva(String nume, int masaAtimicRelativa) {
		super();
		this.nume = nume;
		this.masaAtimicRelativa = masaAtimicRelativa;
	}
	
	public SubstantaActiva() {
	}

	@Override
	public PrototipClonare cloneaza() {
		SubstantaActiva copy = new SubstantaActiva();
		copy.nume = this.nume;
		copy.masaAtimicRelativa = this.masaAtimicRelativa;
		return copy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[nume=");
		builder.append(nume);
		builder.append(", masaAtimicRelativa=");
		builder.append(masaAtimicRelativa);
		builder.append("]");
		return builder.toString();
	}

	
}

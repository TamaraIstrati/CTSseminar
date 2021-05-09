package prototype.clase;

public class RetetaComprimate extends Reteta implements PrototipClonare{
	
	private SubstantaActiva substantaActiva;

	public RetetaComprimate(String denumire, int cantitate, SubstantaActiva substantaActiva) {
		super(denumire, cantitate);
		this.substantaActiva = substantaActiva;
	}
	
	private RetetaComprimate() {
		super();
	}

	public void setSubstantaActiva(SubstantaActiva substantaActiva) {
		this.substantaActiva = substantaActiva;
	}

	@Override
	public PrototipClonare cloneaza() {
		RetetaComprimate copy = new RetetaComprimate();
		copy.setDenumire(super.getDenumire());
		copy.setCantitateSubstActiva(super.getCantitateSubstActiva());
		copy.substantaActiva = (SubstantaActiva) this.substantaActiva.cloneaza();
		return copy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RetetaComprimate [substantaActiva=");
		builder.append(substantaActiva);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}

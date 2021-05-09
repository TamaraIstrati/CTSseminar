package ro.ase.cts.singleton.clase;

public class Itinerar {
	private String startLocation;
	private String destinationLocation;
	private int intermadiarLocations;
	private float distance;
	
	private static Itinerar instance = null ;
	
	private Itinerar(String startLocation, String destinationLocation, int intermadiarLocations, float distanta) {
		super();
		this.startLocation = startLocation;
		this.destinationLocation = destinationLocation;
		this.intermadiarLocations = intermadiarLocations;
		this.distance = distanta;
	}
	
	public static synchronized Itinerar getInstance(String startLocation, String destinationLocation, int intermadiarLocations, float distanta) {
		if(instance == null) {
			instance = new Itinerar(startLocation, destinationLocation, intermadiarLocations, distanta);
		}
		
		return instance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Itinerar [startLocation=");
		builder.append(startLocation);
		builder.append(", destinationLocation=");
		builder.append(destinationLocation);
		builder.append(", intermadiarLocations=");
		builder.append(intermadiarLocations);
		builder.append(", distanta=");
		builder.append(distance);
		builder.append("]");
		return builder.toString();
	}

	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public void setIntermadiarLocations(int intermadiarLocations) {
		this.intermadiarLocations = intermadiarLocations;
	}

	public void setDistance(float distanta) {
		this.distance = distanta;
	}
	
}

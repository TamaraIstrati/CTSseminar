package ro.ase.cts.clase;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class IReader {
	protected String filePath;
	public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;
	
	public IReader(String filePath) {
		super();
		this.filePath = filePath;
	}

}

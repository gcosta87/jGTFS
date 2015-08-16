package ar.com.libreware.jgtfs.specification.persistence.file;

import ar.com.libreware.jgtfs.specification.GTFS;
import ar.com.libreware.jgtfs.specification.persistence.GTFSPersistenseException;
import ar.com.libreware.jgtfs.specification.persistence.GTFSWriter;

/**
 * Persintencia de un GTFS hacia un conjunto de archivos correspondientes a la especificacion.
 * 
 * @author gonzalo
 *
 */
public class GTFSFileWriter extends GTFSWriter {
	public static final String DEFAULT_PATH 	= "";
	
	
	public GTFSFileWriter() {
		this(GTFSFileWriter.DEFAULT_PATH);
	}
	
	
	public GTFSFileWriter(String origen) {
		super(origen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(GTFS gtfs) throws GTFSPersistenseException {
		// TODO Auto-generated method stub
		
	}




}

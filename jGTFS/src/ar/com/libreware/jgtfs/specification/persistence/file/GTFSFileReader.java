package ar.com.libreware.jgtfs.specification.persistence.file;

import ar.com.libreware.jgtfs.specification.GTFS;
import ar.com.libreware.jgtfs.specification.persistence.GTFSPersistenseException;
import ar.com.libreware.jgtfs.specification.persistence.GTFSReader;

/**
 * Recupera un GTFS desde un conjunto de archivos correspondientes a la especificacion.
 * 
 * @author gonzalo
 *
 */
public class GTFSFileReader extends GTFSReader{
	public static final String DEFAULT_PATH 	= "";

	public GTFSFileReader(){
		this(GTFSFileReader.DEFAULT_PATH);
	}
	
	public GTFSFileReader(String origen) {
		super(origen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public GTFS load() throws GTFSPersistenseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validate() throws GTFSPersistenseException {
		// TODO Auto-generated method stub
		
	}




}

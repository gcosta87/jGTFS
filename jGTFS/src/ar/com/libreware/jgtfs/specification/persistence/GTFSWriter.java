package ar.com.libreware.jgtfs.specification.persistence;

import ar.com.libreware.jgtfs.specification.GTFS;

/**
 * Interfaz para realizar la persistencia de un GTFS hacia algun origen/contexto
 * 
 * @author gonzalo
 *
 */
public abstract class GTFSWriter {
	private String origen;
	

	
	public GTFSWriter(String origen) {
		super();
		this.origen = origen;
	}



	public abstract void save(GTFS gtfs) throws GTFSPersistenseException;



	public String getOrigen() {
		return origen;
	}



	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
}

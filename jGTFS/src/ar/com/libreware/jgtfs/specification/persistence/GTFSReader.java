package ar.com.libreware.jgtfs.specification.persistence;

import ar.com.libreware.jgtfs.specification.GTFS;

/**
 * Interfaz para recuperar un GTFS persistido, desde algun origen/contexto
 * 
 * @author gonzalo
 *
 */
public abstract class GTFSReader {
	//	ATRIBUTOS
	//
	private String origen;
	
	
	//	CONSTRUCTORES
	public GTFSReader(String origen){
		this.origen = origen;
	}
	
	
	/**
	 * carga un GTFS 
	 * @return
	 */
	public abstract GTFS load() throws GTFSPersistenseException;
	
	
	/**
	 * verifica que lo que se va a cargar sea válido
	 * @return
	 */
	public abstract void validate() throws GTFSPersistenseException;


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
}

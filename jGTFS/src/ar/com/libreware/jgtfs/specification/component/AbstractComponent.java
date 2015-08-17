package ar.com.libreware.jgtfs.specification.component;

public abstract class AbstractComponent implements Comparable<AbstractComponent>{

	
	/**
	 * Valida que el componente este bien definido
	 * @return
	 */
	public abstract boolean validate();
	
	public abstract void copy(AbstractComponent otherComponent);
	
	public abstract int compareTo(AbstractComponent otherComponent);
	
	public abstract boolean equals(AbstractComponent otherComponent);
}

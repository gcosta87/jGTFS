package ar.com.libreware.jgtfs.specification.component;

/**
 * Representa la Zona utilizada en las paradas para indicar reglas de cobro
 * @author gonzalo
 *
 */
public class Zone extends AbstractComponent{

	private int id;
	private String desc;	//Extra field
	
	
	public Zone(int id){
		this.id = id;
	}
	
	public Zone(int id,String desc){
		this(id);
		this.desc = desc;
	}

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void copy(AbstractComponent otherComponent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(AbstractComponent otherComponent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean equals(AbstractComponent otherComponent) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}

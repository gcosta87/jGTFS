package ar.com.libreware.jgtfs.specification.component.extra;

/**
 * Representa a un Enumerativo mas configurable. Util para representar las diversas constantes y normalizar la interfaz
 * @author gonzalo
 *
 */
public class ConstantEnum implements Comparable<ConstantEnum>{

	private byte value;
	
	public ConstantEnum(int value){
		this.value = (byte)value;
	}
	
	public byte getValue(){
		return this.value;
	}

	@Override
	public int compareTo(ConstantEnum constantEnum) {
		if(this.value == constantEnum.getValue()){
			return 0;
		}
		else{
			if(this.value < constantEnum.getValue()){
				return -1;
			}
			else{
				return +1;
			}
		}
	}
}

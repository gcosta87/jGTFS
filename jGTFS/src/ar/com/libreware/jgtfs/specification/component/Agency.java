package ar.com.libreware.jgtfs.specification.component;


/**
 * Clase que mapea Agency.txt
 * 
 * @author gonzalo
 *
 */
public class Agency extends AbstractComponent{
	/**
	 * Valor por defecto para el lang seteado en Español.
	 */
	public static final String DEFAULT_LANG	= "es";
	/**
	 * Valor por defecto para el timezone seteado para la zona horaria de Argentina.
	 */
	public static final String DEFAULT_TIMEZONE	= "America/Argentina/Buenos_Aires";
	
	private String	id,
					name,
					url, 
					phone,
					lang,
					timezone,
					fareUrl;
	
	
	/***
	 * Construye una Agency con sus atributos en null
	 */
	public Agency(){
	
	}

	public Agency(String id, String name, String url, String phone, String lang, String timezone, String fareUrl) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.phone = phone;
		this.lang = lang;
		this.timezone = timezone;
		this.fareUrl = fareUrl;
	}


	/**
	 * Construye una agencia con el nombre indicado, timezone/lang/id en default y el resto de los atributos en null.
	 * @param name
	 */
	public Agency(String name) {
		this(null,name,null,null,Agency.DEFAULT_LANG,Agency.DEFAULT_TIMEZONE,null);
		//seteo el id con uno automático: se le quitan las vocales (incluso con acentos) al name, y se pasa a mayus.
		this.setId(name.replaceAll("[aeiouAEIOUÁÉÍÓÚáéíóú -_]", "").toUpperCase());
	}


	@Override
	public String toString() {
		return "Agency [id=" + id + ", name=" + name + ", url=" + url + ", phone=" + phone + ", lang=" + lang
				+ ", timezone=" + timezone + ", fareUrl=" + fareUrl + "]";
	}






	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getUrl() {
		return url;
	}





	public void setUrl(String url) {
		this.url = url;
	}





	public String getPhone() {
		return phone;
	}





	public void setPhone(String phone) {
		this.phone = phone;
	}





	public String getLang() {
		return lang;
	}





	public void setLang(String lang) {
		this.lang = lang;
	}





	public String getFareUrl() {
		return fareUrl;
	}





	public void setFareUrl(String fare_url) {
		this.fareUrl = fare_url;
	}





	public String getTimezone() {
		return timezone;
	}





	public void setTimezone(String timezone) {
		this.timezone = timezone;
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
}

package ar.com.libreware.jgtfs.specification.component;

/**
 * Clase que mapea a stops.txt
 * 
 * @author gonzalo
 *
 */
public class Stop extends AbstractComponent{
	public static final String DEFAULT_TIMEZONE	= "America/Argentina/Buenos_Aires";
	
	public static enum LocationType{
		/**
		 * Define que la parada, es en si misma  una y no se encuentra ubicada en una Estación.
		 */
		STOP,
		/**
		 * Define que la parada es una Estación (contiene a otras paradas).
		 */
		STATION;
	}
	
	public static enum  WheelchairBoarding{
		/**
		 * No se especifica informacion sobre si se puede acceder usando silla de ruedas.
		 */
		NOT_ESPECIFIED(0),
		
		/**
		 * Indica que la parada cuenta con soporte para acceder usando silla de ruedas
		 */
		SUPPORTED(1),
		
		/**
		 * Indica que la parada no cuenta no cuenta con soporte para acceder usando silla de ruedas.
		 */
		NOT_SUPPORTED(2),
		/**
		 * Solo para los casos de ser una parada ubicada en una Estacion, indica que esta caracteristica depende de la definicion en la Estacion.
		 */
		STATION_INHERIT(0);
		
		private byte value;
		
		private WheelchairBoarding(int value){
			this.value = (byte)value;
		}
		
	}

	private String id,code,name,desc,url,timezone;
	private Coordinate coordinate;
	private Stop parentStation;
	private LocationType locationType;
	private Zone zone;
	private WheelchairBoarding wheelchairBoarding;

	/** 
	 * Crea una parada, que no pertencezca a una Station, con el name y coordinate 
	 * @param id
	 * @param name
	 * @param coordinate
	 */
	public Stop(String id, String name, Coordinate coordinate){
		this.id=id;
		this.name = name;
		this.coordinate = coordinate;
		
		this.parentStation = null;
		this.locationType = LocationType.STOP;
		
		this.wheelchairBoarding = WheelchairBoarding.NOT_ESPECIFIED;
	}
	
	public Stop(String id, String name, float lat,float lon){
		this(id,name,new Coordinate(lat, lon));
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Stop getParentStation() {
		return parentStation;
	}

	public void setParentStation(Stop parentStation) {
		this.parentStation = parentStation;
	}

	public LocationType getLocationType() {
		return locationType;
	}

	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public WheelchairBoarding getWheelchairBoarding() {
		return wheelchairBoarding;
	}

	public void setWheelchairBoarding(WheelchairBoarding wheelchairBoarding) {
		this.wheelchairBoarding = wheelchairBoarding;
	}
		
}

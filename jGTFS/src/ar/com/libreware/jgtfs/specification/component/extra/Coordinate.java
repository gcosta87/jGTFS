package ar.com.libreware.jgtfs.specification.component.extra;

import java.text.DecimalFormat;

import ar.com.libreware.jgtfs.specification.component.AbstractComponent;

public class Coordinate extends AbstractComponent{
	private static final DecimalFormat formato = new DecimalFormat();
	private static final String FORMAT_LAT	= "##.######";
	private static final String FORMAT_LON	= "###.######";

	private float lat,lon;
	
	public Coordinate(float lat, float lon){
		this.lat = lat;
		this.lon = lon;
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

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public float getLon() {
		return lon;
	}

	public void setLon(float lon) {
		this.lon = lon;
	}
	
	public String getLatString(){
		Coordinate.formato.applyPattern(Coordinate.FORMAT_LAT);
		return Coordinate.formato.format(this.lat);
	}
	
	public String getLonString(){
		Coordinate.formato.applyPattern(Coordinate.FORMAT_LON);
		return Coordinate.formato.format(this.lon);
	}

	@Override
	public boolean equals(AbstractComponent otherComponent) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString(){
		return "Coordinate ("+this.getLatString()+", "+this.getLonString()+")";
	}
}

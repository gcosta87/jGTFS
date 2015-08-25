package ar.com.libreware.jgtfs.specification.component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Calendar extends AbstractComponent{

	public enum Days{
		Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
	}
	
	private String id;
	private Set<Days> activeDays;
	private Date start,end;
	
	public Calendar(){
		
	}
	
	/**
	 * Crea un objeto Calendar, que representa los dias que esta disponible/activo un serivicio en un rango de fechas establecido.
	 * @param id
	 * @param start fecha que indica el comienzo de la vigencia del servicio
	 * @param end fecha que indica el fin de la vigencia del servicio
	 * @param activeDays listado de dias en los cuales el servicio esta disponible
	 */
	public Calendar(String id,Date start,Date end, Days... activeDays){
		this.id = id;
		this.start = start;
		this.end = end;
		
		this.activeDays = new TreeSet<Days>();
		this.addDays(activeDays);
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

	public Set<Days> getDays() {
		return activeDays;
	}

	public void setDays(Set<Days> activeDays) {
		this.activeDays = activeDays;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
	
	public void addDays(Days... activeDays){
		this.activeDays.addAll(Arrays.asList(activeDays));
	}
	
	public void removeDay(Days activeDay){
		this.activeDays.remove(activeDay);
	}

}

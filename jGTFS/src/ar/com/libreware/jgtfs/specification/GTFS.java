package ar.com.libreware.jgtfs.specification;

import java.util.ArrayList;
import java.util.List;

import ar.com.libreware.jgtfs.specification.component.Agency;
import ar.com.libreware.jgtfs.specification.component.Calendar;
import ar.com.libreware.jgtfs.specification.component.CalendarDate;
import ar.com.libreware.jgtfs.specification.component.FareAttribute;
import ar.com.libreware.jgtfs.specification.component.FareRule;
import ar.com.libreware.jgtfs.specification.component.FeedInfo;
import ar.com.libreware.jgtfs.specification.component.Frequency;
import ar.com.libreware.jgtfs.specification.component.Route;
import ar.com.libreware.jgtfs.specification.component.Shape;
import ar.com.libreware.jgtfs.specification.component.Stop;
import ar.com.libreware.jgtfs.specification.component.StopTime;
import ar.com.libreware.jgtfs.specification.component.Transfer;
import ar.com.libreware.jgtfs.specification.component.Trip;
import ar.com.libreware.jgtfs.specification.persistence.GTFSPersistenseException;
import ar.com.libreware.jgtfs.specification.persistence.GTFSReader;
import ar.com.libreware.jgtfs.specification.persistence.GTFSWriter;
import ar.com.libreware.jgtfs.specification.persistence.file.GTFSFileReader;
import ar.com.libreware.jgtfs.specification.persistence.file.GTFSFileWriter;

/**
 * Clase que representa de manera abstracta toda la especificación de GTFS concreta.
 * 
 * @author gonzalo
 *
 */
public class GTFS {
	//	ATRIBUTOS
	//
	private List<Agency> agencies;
	
	private List<Stop> stops;
	
	private List<Route> routes;
	private List<Trip> trips;
	private List<StopTime> stopTimes;
	
	private List<Calendar> calendars;
	private List<CalendarDate> calendarDates;
	
	private List<FareAttribute> fareAtributes;
	private List<FareRule> fareRules;
	
	private List<Shape> shapes;
	
	private List<Frequency> frequencies;
	
	private List<Transfer> transfers;
	
	private FeedInfo feedInfo;
	
	
	//Persistencia
	private GTFSWriter gtfsWriter;
	private GTFSReader gtfsReader;
	
	//	CONSTRUCTORES
	//
	public GTFS(){
		this.agencies	= new ArrayList<Agency>();
		
		this.stops		= new ArrayList<Stop>();
		
		this.routes		= new ArrayList<Route>();
		this.trips		= new ArrayList<Trip>();
		this.stopTimes	= new ArrayList<StopTime>();
		
		this.calendars		= new ArrayList<Calendar>();
		this.calendarDates	= new ArrayList<CalendarDate>();
		
		this.fareAtributes	= new ArrayList<FareAttribute>();
		this.fareRules		= new ArrayList<FareRule>();
		
		this.shapes = new ArrayList<Shape>();
		
		this.frequencies	= new ArrayList<Frequency>();
		
		this.transfers		= new ArrayList<Transfer>();

		this.feedInfo = new FeedInfo();
		
		this.gtfsReader = new GTFSFileReader();
		this.gtfsWriter = new GTFSFileWriter();
	}
	
	public GTFS(GTFS otroGFST){
		this.copy(otroGFST);
	}
	
	public GTFS(GTFSReader gtfsReader, GTFSWriter gtfsWriter){
		this();
		
		this.gtfsReader = gtfsReader;
		this.gtfsWriter = gtfsWriter;
	}
	
	
	
	//	METODOS
	//
	public void copy(GTFS otroGTFS){
		//TODO falta implementar!
	}
	
	public void load() throws GTFSPersistenseException{
		GTFS nuevo = this.gtfsReader.load();
		this.copy(nuevo);
	}
	
	public void save() throws GTFSPersistenseException{
		this.gtfsWriter.save(this);
	}

	public boolean validate(){
		//TODO falta implementar!
		return false;
	}
	
	//	GETTERS/SETTERS
	public List<Agency> getAgencies() {
		return this.agencies;
	}

	public void setAgencies(List<Agency> agencies) {
		this.agencies = agencies;
	}

	public List<Stop> getStops() {
		return stops;
	}

	public void setStops(List<Stop> stops) {
		this.stops = stops;
	}

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	public List<Trip> getTrips() {
		return trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}

	public List<StopTime> getStopTimes() {
		return stopTimes;
	}

	public void setStopTimes(List<StopTime> stopTimes) {
		this.stopTimes = stopTimes;
	}

	public List<Calendar> getCalendars() {
		return calendars;
	}

	public void setCalendars(List<Calendar> calendars) {
		this.calendars = calendars;
	}

	public List<CalendarDate> getCalendarDates() {
		return calendarDates;
	}

	public void setCalendarDates(List<CalendarDate> calendarDates) {
		this.calendarDates = calendarDates;
	}

	public List<FareAttribute> getFareAtributes() {
		return fareAtributes;
	}

	public void setFareAtributes(List<FareAttribute> fareAtributes) {
		this.fareAtributes = fareAtributes;
	}

	public List<FareRule> getFareRules() {
		return fareRules;
	}

	public void setFareRules(List<FareRule> fareRules) {
		this.fareRules = fareRules;
	}

	public List<Shape> getShapes() {
		return shapes;
	}

	public void setShapes(List<Shape> shapes) {
		this.shapes = shapes;
	}

	public List<Frequency> getFrequencies() {
		return frequencies;
	}

	public void setFrequencies(List<Frequency> frequencies) {
		this.frequencies = frequencies;
	}

	public List<Transfer> getTransfers() {
		return transfers;
	}

	public void setTransfers(List<Transfer> transfers) {
		this.transfers = transfers;
	}

	public FeedInfo getFeedInfo() {
		return feedInfo;
	}

	public void setFeedInfo(FeedInfo feedInfo) {
		this.feedInfo = feedInfo;
	}

	public GTFSWriter getGtfsWriter() {
		return gtfsWriter;
	}

	public void setGtfsWriter(GTFSWriter gtfsWriter) {
		this.gtfsWriter = gtfsWriter;
	}

	public GTFSReader getGtfsReader() {
		return gtfsReader;
	}

	public void setGtfsReader(GTFSReader gtfsReader) {
		this.gtfsReader = gtfsReader;
	}
}

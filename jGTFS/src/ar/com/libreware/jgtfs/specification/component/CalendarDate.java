package ar.com.libreware.jgtfs.specification.component;

import java.util.Date;

import ar.com.libreware.jgtfs.specification.component.extra.ConstantEnum;

public class CalendarDate extends AbstractComponent{
	//TODO normalizar los enum para independizarlos (si comienzan en 1 o poeen otros valores identicos) y normalizarlos
	
	public static final class ExceptionType extends ConstantEnum{
		public static final ExceptionType AddDate = new ExceptionType(1);
		public static final ExceptionType DeleteDate= new ExceptionType(2);
		
		private ExceptionType(int value){
			super(value);
		}
	}
	
	
	private String idCalendar;
	private Date date;
	private ExceptionType exceptionType;

	
	public CalendarDate(String idCalendar, Date date, ExceptionType exceptionType) {
		this.idCalendar = idCalendar;
		this.date = date;
		this.exceptionType = exceptionType;
	}
	

	public CalendarDate(Calendar calendar, Date date, ExceptionType exceptionType) {
		this(calendar.getId(),date,exceptionType);
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


	public String getIdCalendar() {
		return idCalendar;
	}


	public void setIdCalendar(String idCalendar) {
		this.idCalendar = idCalendar;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public ExceptionType getExceptionType() {
		return exceptionType;
	}


	public void setExceptionType(ExceptionType exceptionType) {
		this.exceptionType = exceptionType;
	}
}

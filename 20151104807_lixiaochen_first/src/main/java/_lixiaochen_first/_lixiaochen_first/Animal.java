package _lixiaochen_first._lixiaochen_first;

import java.util.Date;

public class Animal {
	private String name;
	private Date date;
	
	public Animal() {
		
	}
	
	public Animal(String name, Date date) {
		super();
		this.name = name;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}

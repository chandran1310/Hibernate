package hibernate.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Charger 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Override
	public String toString() {
		return "Charger [id=" + id + ", watt=" + watt + "]";
	}
	private String watt;
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWatt() {
		return watt;
	}
	public void setWalt(String watt) {
		this.watt = watt;
	}


}

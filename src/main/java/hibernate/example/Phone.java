package hibernate.example;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Phone 
{
	@Override
	public String toString() {
		return "Phone [id=" + id + ", brand=" + brand + ", charger=" + charger + ", price=" + price + "]";
	}
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	
	@OneToOne(cascade = CascadeType.ALL)
	public Charger charger;
	
	
	
	public int getId() {
		return id;
	}
	public Charger getCharger() {
		return charger;
	}
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private double price;

}

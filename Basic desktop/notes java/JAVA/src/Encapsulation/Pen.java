package Encapsulation;

public class Pen {

	private String colour;
	private String brand;
	private int price;
 
	public Pen(String colour,String brand, int price)
	{
		this.colour=colour;
		this.brand=brand;
		this.price=price;
	}
	public String write() {
	return colour;
	}
}

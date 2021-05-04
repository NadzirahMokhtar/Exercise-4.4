
//Sub class for Apple
public class GreenApple extends Apple {
	
	protected double price, weight;
	protected String colour;
	public GreenApple(String name, int quantity, double price, String colour) {
		super(name, quantity, price);
		this.colour = colour;
		System.out.println();

}
	public String toString() {
		return ("Name = " + super.name + "" + "\n colour = " + colour + "\n weight = " + weight + "\n price :" + price + "each");
		
	}
}

//End GreenApple extends Apple class

//Sub Class of Fruits
public class Watermelon extends Fruits {
	
	double price;
	double weight;
	String colour;
	
	//Constructor for sub class
	public Watermelon(String name, String colour, double weight, double price) {
		//Inherit data,method from super class
		super(name);
		this.colour = colour;
		this.weight = weight;
		this.price = price;
		System.out.println();
		
		if (this.weight < 1.50) {
			System.out.println("The total price is RM" + totalPrice());
			
		} 
		
		else if ((this.weight >= 1) && (this.weight < 7)) {
			
			double a = 5;
			System.out.println("The total price is RM" + totalPrice(a));
			
		}
		else 
		{
			
			double a = 3;
			double c = this.weight;
			System.out.println("The total price is RM" + totalPrice(a, c));
			
		}
		
	}
	
	//Overriding
	public void type(){	
		String [] typesOfWatermelon = {"Citron", "Citrullus", "Amarillo"};
		System.out.println("Types of Watermelon : ");
		for (int i = 0; i < typesOfWatermelon.length; i++) {
			System.out.println(typesOfWatermelon[i]);
			System.out.println();
			
		}
		
	}
	
	public String toString() { 
		return ("Name = " + super.name + "" + "\n colour = " + colour + "\n weight = " + weight + "\n price :" + price + "per kg");
		
	}
	
	public double totalPrice() {				
		return this.price * this.weight;
	
	}
	
	public double totalPrice(double a) {		
		return a * this.weight;
	
	}
	
	public double totalPrice(double a, double c) {	
		return a * c;
	
	}
	
}

//End Watermelon extend Fruit class

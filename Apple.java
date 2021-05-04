
//Subclass of fruits
class Apple extends Fruits {
	
	//Control who is going to access this data
	protected int quantity; 
	protected double price;
	public Apple(String name, int quantity, double price) {
		//Inherit data,method from super class
		super(name); 
		this.quantity = quantity;
		this.price = price;
		
		if (this.quantity < 10) {
			System.out.println("The total price is RM" + totalPrice());
			
		}
		else if ((this.quantity >= 10) && (this.quantity < 40)) {
			double a = 2.00;
			System.out.println("The total price is RM" + totalPrice(a));
			
		}
		else 
		{
			double a = 1.50;
			int b = this.quantity;
			System.out.println("The total price is RM" + totalPrice(a,b));
			
		}
		
	}
	
	//Overriding
	public void type(){	
		System.out.println("Type of Apple");
		System.out.println("1.Red Apple " + "\n 2. Green Apple");
		
	}
	
	public String toString() { 
		return ("Name = " + super.name + "" + "\n weight = " + quantity + "\n price :" + price + " each");
		
	}
	
	//Overloading method with no arguments
	public double totalPrice() {
		return this.price * this.quantity;
		
	}
	
	//Overloading method with 1 argument
	public double totalPrice(double a) {
		return a * this.quantity;
		
	}
	
	//Overloading method with 2 arguments
	public double totalPrice(double a, int b) {	
		return a * b;
		
	}
}
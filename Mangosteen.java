
//Sub Class of Fruits
public class Mangosteen extends Fruits {
	
	double price;
	String colour;
	int pack;
	
	//Constructor for sub class
	public Mangosteen(String name, double price, int pack) {
		//Inherit data,method from super class
		super(name);
		this.pack = pack;
		this.price = price;
		System.out.println();
		
	}
	
	public void type(){	
		String [] Mangosteen = {"Mangostana", "Mesta", "Garcinia Combogia"};
		System.out.println("Types of Orange:");
		
		for (int i = 0; i < Mangosteen.length; i++) {
			System.out.println(Mangosteen[i]);
			System.out.println();
			
		}
		
	}
	
	public String toString() { 
		return ("Name = " + super.name + "\n pack = " + pack + "\n price :" + price + "each pack");
		
	}
}

//End Mangosteen extend Fruit class

public class Main {
	
	public static void main(String[] args) {
	System.out.println();
		
	Fruits f = new Fruits("Fruits");
	System.out.println(f);
	System.out.println();
	
	Apple a = new Apple("Apple", 2, 1.2);
	System.out.println(a);
	System.out.println();
    
	RedApple b = new RedApple("Red Apple", 3, 1.00, "Bright Red");
	System.out.println(b);
	System.out.println();
    
	GreenApple c = new GreenApple("Green Apple", 5, 1.3, "Green");
	System.out.println(c);
	System.out.println();
    
	Watermelon d = new Watermelon("Watermelon", "Red", 25, 10);
	System.out.println(d);
	System.out.println();
    
	Mangosteen e = new Mangosteen("Mangosteen", 2, 12);
	System.out.println(e);
	System.out.println();
}

}
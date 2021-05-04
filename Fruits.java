
//Super class of all fruits
class Fruits { 
	
	protected String name;
	public Fruits(String name) { //Constructor with argument
		this.name = name;
		System.out.println(this.name);
		System.out.println("Fruit constructor is invoked");
		System.out.println();
		
		}		
		public String getName() {
			return this.name;
			
		}
}


package phoneMaker;

public class phones {
	
	
	String phoneName;
	String color;
	int ram;
	int storage;
	double size;
	
	int price;
	String country;
	int quantity;
	
	phones(String phoneName, String color, int ram, int storage, double size){
		this.phoneName=phoneName;
		this.color=color;
		this.ram=ram;
		this.storage=storage;
		this.size=size;
		
	}
	void showSpecs() {
		System.out.println("\nPhone name : " + phoneName.toUpperCase());
		System.out.println("Color : " + color);
		System.out.println("RAM : " + ram + " Gigabytes of RAM");
		System.out.println("Storage : " + storage +" Gigabytes");
		System.out.println("Size : " + size+"\n");
	}
	void publishPhone(int price, String country, int quantity) {
		this.price=price;
		this.country=country;
		this.quantity=quantity;
		
		System.out.println("\nPhone name: " +phoneName.toUpperCase()+"\nPrice : " + price+" PHP");
		System.out.println("Made by : " + country.toUpperCase());
		System.out.println("Quantity : " + quantity);
		System.out.println(phoneName.toUpperCase() +" Published!");
	}
	
}
	

	
	


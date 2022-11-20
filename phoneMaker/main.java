package phoneMaker;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Create phone name : ");
		String type=sc.nextLine();
		
		System.out.print("What Color : ");
		String color=sc.nextLine();
		
		System.out.print("How many ram : ");
		int ram=sc.nextInt();
		
		System.out.print("How many storage: ");
		int storage=sc.nextInt();
		
		System.out.print("What size : ");
		double size=sc.nextDouble();
		sc.nextLine();
		
		phones phones = new phones(type, color, ram, storage, size);
		
		phones.showSpecs();
		
		System.out.print("Would you like to publish it?\nYes or No:");
		String choice=sc.nextLine();
		if(choice.equalsIgnoreCase("Yes")) {
			System.out.print("How much will it cost for this phone?\nInput price :" );
			int phoneprice = sc.nextInt();
			sc.nextLine();
			System.out.print("Country Origin : ");
			String orig=sc.nextLine();
			System.out.print("How many phones will you create?\nInput here : ");
			int many=sc.nextInt();
			
			phones.publishPhone(phoneprice, orig, many);
		}else if(choice.equalsIgnoreCase("No")) {
			System.out.println("OKAY");
		}else {
			System.out.println("Type Invalid");
		}
		

	}

}

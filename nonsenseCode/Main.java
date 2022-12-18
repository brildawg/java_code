import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        
      
        Scanner sc = new Scanner(System.in);
       
        
        System.out.print("What type of weapon are you creating?");
        String weapon=sc.nextLine();
        System.out.print("Create a name for this weapon : ");
        String create=sc.nextLine();

        weapons weapons = new weapons(weapon,create);

        
        System.out.println("Would you like to create a amor?\nYes or No : ");
        String choice=sc.nextLine();

        if(choice.equalsIgnoreCase("Yes")){
        System.out.print("Armor type : ");
        String type=sc.nextLine();
        System.out.print("Armor name : ");
        String aname=sc.nextLine();
        System.out.println();
        weapons.ArmorAndWeapon(weapon, type+" "+aname);
        }else if(choice.equalsIgnoreCase("No")){
            System.out.println("Okay");
            System.out.println("You didn't create armor but you created a weapon");
            weapons.displayWeapon();
        }else{
            System.out.println("Choice invalid!");
        }
    
        

        

       
       
        }
        
}
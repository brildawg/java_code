public class weapons {

    private String weaponType;
    private String weaponName;
    private String armorType;
    private String armorName;

    weapons(String weaponType, String weaponName){
        this.weaponType=weaponType;
        this.weaponName=weaponName;
    }
    void displayWeapon(){
        System.out.println("Your weapon name is : " +weaponName.toUpperCase());
        System.out.println("Weapon type : " + weaponType.toUpperCase());
    }
   
    void makeArmor(String armorType, String armorName){
        this.armorName=armorName;
        this.armorType=armorType;
        System.out.println("Your armor was created");
        System.out.println("Armor type : " + armorType.toUpperCase());
        System.out.println("The name of your armor is : " +armorName.toUpperCase());
    }
    void ArmorAndWeapon(String weaponName, String armorName){
        this.weaponName=weaponName;
        this.armorName=armorName;
        System.out.println("You created a weapon named, " +weaponName.toUpperCase()+"!!");
        System.out.println("You created a armor type and named, " +armorName.toUpperCase()+"!!");

    }
}

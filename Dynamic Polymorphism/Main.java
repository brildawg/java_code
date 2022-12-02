import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Animal animal;

        System.out.println("Choose one would you like to hear");
        System.out.print("1. Dog or 2. Cat : ");
        int choice = sc.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();
        }else if(choice==2){
            animal = new Cat();
            animal.speak();
        }else{
            System.out.println("Choice error");
            animal = new Animal();
            animal.speak();
        }
    }
}
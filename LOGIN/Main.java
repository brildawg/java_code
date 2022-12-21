import java.util.Scanner;


class Main{
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        

        System.out.println("\t--Welcome--\t");
        System.out.println("Create your account");
        System.out.print("Create username : ");
        String user = scan.nextLine();
        System.out.print("Create password : ");
        String password=scan.nextLine();
        

        Account acc = new Account(user, password);
        acc.accdisplay();
        
        if(password.length()>8){
        System.out.print("\n\tYou can LOGIN if you're a admin\t\nWould you like to Login\nYes or No : ");
        String choice = scan.nextLine();
        String loginUS=user;
        String loginPW=password;
        if(choice.equalsIgnoreCase("Yes")){ 
            System.out.print("USERNAME : ");
            loginUS=scan.nextLine();
            System.out.print("PASSWORD : ");
            loginPW=scan.nextLine();
            if(loginUS.equals(user) && loginPW.equals(password)){
                System.out.println("LOGIN SUCCESS");
            }else if(loginUS.equals("ADMIN") && loginPW.equals("12345")){
                System.out.println("LOGIN SUCCESS");
            }else{
                System.out.println("Account not found");
            }

        }else if(choice.equalsIgnoreCase("No")){
            System.out.println("OKAY FINE");
        }
        }
    }
}
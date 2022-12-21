public class Account {

    private String username;
    private String password;
    

    Account(String username, String password){
        this.username=username;
        this.password=password;
        
    }

   void accdisplay(){
    if(password.length()>=8){
        System.out.println("\nAccount created successfully!");
        System.out.println("You created a strong password\n" + "Your password has "+password.length() +" characters");
    }else if(password.isBlank()){
        System.out.println("\nYou didn't create a password");
    }else if(password.length()<8){
        System.out.println("\nCreate atleast 8 or more characters for your password");
    }
   }
        
}

import java.util.InputMismatchException;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter a whole number to dived : ");
        int x = sc.nextInt();

        System.out.print("Enter a number to divide by : ");
        int y = sc.nextInt();

        int z = x/y;
        System.out.println(z);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide a number to 0");
        }catch(InputMismatchException e){
            System.out.println("Numbers only ");
        }finally{
            System.out.println("\n\nPROGRAM FINISHED");
            sc.close();
        }
    }
}
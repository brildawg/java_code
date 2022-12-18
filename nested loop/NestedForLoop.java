import java.util.Scanner;

class main{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

       int rows;
       int columns;

       int numbers;

       System.out.print("How many rows do you want ? ");
       rows=sc.nextInt();
       System.out.print("How many columns do you want ? ");
       columns=sc.nextInt();
       System.out.print("Enter number to use : ");
       numbers=sc.nextInt();

       for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.print(numbers);
            }
       }
       }

      
    }

package calculator;

import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       System.out.println("Choose Operators \n" + "[+, - , * , /] \n" );
       System.out.println("Add for +");
       System.out.println("Sub for -");
       System.out.println("Mul for *");
       System.out.println("Div for Divide ");
      
       System.out.print("Select  Operators :");
       String choose = s.nextLine();

       System.out.println("Enter Two Numbers  ");
       
       System.out.print("First Number : ");
       int x = s.nextInt();
       System.out.print("Second Number : ");
       int y = s.nextInt();
       

       if(choose.equalsIgnoreCase("Add") ){
            System.out.println("Result is :" + addition(x,y));
       }
       else if (choose.equalsIgnoreCase("Sub")){
            System.out.println("Result is :" + subtraction(x,y));
       }
       else if (choose.equalsIgnoreCase("Mul")){
            System.out.println("Result is :" + multiply(x,y));

       }
       else if (choose.equalsIgnoreCase("Div")){
        System.out.println("Result is :" + divide(x,y));

       }
       else {
        System.out.println("Input invalid");
       }
       s.close();
      
         
    }
    static int addition(int x, int y){
        int n;
        n=x+y;
        return n;
    }
    static int subtraction(int x, int y){
        int n;
        n= x-y;
        return n;

    }
     static int multiply(int x, int y){
        int n;
        n=x*y;
        return n;
    }
    static int divide(int x, int y){
        int n;
        n=x/y;
        return n;
        
    }
}

package java;

import java.util.ArrayList;
import java.util.Scanner;

class bankLoan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList< ArrayList<Integer>> loanbank = new ArrayList<>();
        ArrayList<Integer> loan = new ArrayList<Integer>();
        loan.add(20000);
        loan.add(40000);
        loan.add(60000);
        loan.add(80000);

        ArrayList<Integer> years = new ArrayList<Integer>();

        years.add(1);
        years.add(2);
        years.add(3);
        years.add(4);

        System.out.print(loan + "\nChoose your loan : ");
        int chooseL = sc.nextInt();

        System.out.println(years+"\nHow many years do you want to pay this?");
        int chooseY = sc.nextInt();
        sc.close();
    
        loanbank.add(loan);
        loanbank.add(years);

        switch(chooseL){
            case 20000:  case 1:
            System.out.println("You chose, " + chooseL);
            break;

            case 40000:
            System.out.println("You chose, " + chooseL);
            break;

            case 60000:
            System.out.println("You chose, " + chooseL);
            break;

            case 80000:
            System.out.println("You chose, " + chooseL);
            break;

            default: System.out.println("Loan Invalid");
        }
        switch(chooseY){
            case 1 : 
            System.out.println("You chose, " + chooseY + "year, " + perMonth1(chooseL, chooseY) + ", per month");
            break; 

            case 2 : 
            System.out.println("You chose, " + chooseY + " years, " + perMonth2(chooseL, chooseY) + ", per month");
            break; 

            case 3 : 
            System.out.println("You chose, " + chooseY+ " years, "+ perMonth3(chooseL, chooseY) + ", per month");
            break; 

            case 4 : 
            System.out.println("You chose, " + chooseY+ " years, "+ perMonth4(chooseL, chooseY) + ", per month");
            break; 
        }
    }
    static int perMonth1(int chooseL, int chooseY) {
        int month = 12;
        month = chooseL / month;
        return month;
    }
    static int perMonth2(int chooseL, int chooseY) {
        int month = 24;
        month = chooseL / month;
        return month;
    }
    static int perMonth3(int chooseL, int chooseY) {
        int month = 36;
        month = chooseL / month;
        return month;
    }
    static int perMonth4(int chooseL, int chooseY) {
        int month = 48;
        month = chooseL / month;
        return month;
    }
}
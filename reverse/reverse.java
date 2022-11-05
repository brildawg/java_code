package reverse;

import java.util.Scanner;
public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverse r = new reverse();
        
        System.out.println("--Reversing any word that you want--");
        System.out.print("Enter any words :");
        String words=sc.nextLine();

        r.wordInfo(words);
        r.reverseWord();

    }
    String word; 
    
    void wordInfo(String word){
        this.word=word;
        System.out.println("You Inputted, " + word);
    }
    
    void reverseWord(){
        System.out.println("\nYou reversed the word, " + word + "\nResult is");
        for(int i =word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
    }
}


package lab_inheritance;

import java.util.Scanner;

public class Main_ItBasics {
    public static void main(String[] args){
        System.out.print("Enter a word in Italian: ");
        Scanner input = new Scanner(System.in);
        String w1 = input.next();
        System.out.println("You entered: " + w1);
        System.out.println("Your word in polish: " + ItalianBasic.itTopl(w1));
        System.out.print("Enter a word in Polish: ");
        String w2 = input.next();
        System.out.println("You entered: " + w2);
        System.out.println("Your word in italian: " + ItalianBasic.plToit(w2));

    }
}

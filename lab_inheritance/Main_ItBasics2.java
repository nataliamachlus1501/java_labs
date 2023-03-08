package lab_inheritance;

import java.util.Scanner;

public class Main_ItBasics2 {
    public static void main(String[] args){
        System.out.print("Enter a word in Italian: ");
        Scanner input = new Scanner(System.in);
        String w3 = input.next();
        System.out.println("You entered: " + w3);
        System.out.println("Your word in polish: " + ItalianAdvanced.itTopl(w3));
        System.out.print("Enter a number in Italian(uno,due,tre): ");
        String w4 = input.next();
        System.out.println("You entered: " + w4);
        System.out.println("Your number in polish: " + ItalianAdvanced.noTOpl(w4));
        System.out.print("Enter a number in Polish(jeden,dwa,trzy): ");
        String w5 = input.next();
        System.out.println("You entered: " + w5);
        System.out.println("Your number in Italian: " + ItalianAdvanced.noTOit(w5));

    }
}

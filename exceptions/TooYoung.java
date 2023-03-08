package exceptions;

import java.util.Scanner;

public class TooYoung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("How old are you? ");
        try {
            input = sc.nextInt();
            ///String str = String.valueOf(input);
        if (input < 18) {
            throw new TooYoungException("Too young. ");
        } else {
            System.out.println("You entered: " + input);
        }
    } catch (TooYoungException e) {
        System.out.println(e.getMessage());
    } catch(NumberFormatException e){
        System.out.println("You entered non-integer value. ");
    }
    sc.close();
}
}


package exceptions;

import java.util.Scanner;

public class MyException1_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("How tall are you (in cm)? ");
        try {
            input = sc.nextInt();
            if (input < 0) {
                throw new MyException1("Not valid hights. ");
            } else {
                System.out.println("You entered: " + input);
            }
        } catch (MyException1 e) {
            System.out.println(e.getMessage());
        } catch(NumberFormatException e){
            System.out.println("You entered non-integer value. ");
        }
        sc.close();
    }
}

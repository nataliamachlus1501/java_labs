package exceptions;
import java.util.Scanner;

public class exception_divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int i1;
        int i2;
        boolean close = false;
        while (!close) {
            System.out.println("Please enter an integer value: ");
            try {
                input = sc.next();
                //convert String to int
                i1 = Integer.parseInt(input);
                System.out.println("You entered: " + i1);
                close = true;
                System.out.println("Please enter another integer value: ");
                try {
                    input = sc.next();
                    //convert String to int
                    i2 = Integer.parseInt(input);
                    System.out.println("You entered: " + i2);
                    try {
                        System.out.println("The division of your first number by your second number is: " + i1 / i2);
                    } catch (ArithmeticException e) {
                        System.out.println("You can't divide by zero!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("You didn't enter an integer value ");
                }
            } catch (NumberFormatException e) {
                System.out.println("You didn't enter an integer value ");
            } finally {
                System.out.println("The end. ");
            }
        }
    }
}



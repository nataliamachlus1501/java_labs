package lab_inheritance;

import java.util.Scanner;

public class Main_Calc {
    public static void main(String[] args){
        System.out.print("Enter an integer number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("You entered: " + num1);
        //object1
        ScientificCalculator s1 = new ScientificCalculator();
        //calling method
        //displaying in console
        System.out.println("factorial of " + num1 + " " + "equals to" + " " + s1.factorial(num1));
        System.out.print("Enter another integer number: ");
        int num2 = input.nextInt();
        System.out.println("You entered: " + num2);
        double result_add = s1.add(num1,num2);
        double result_modulo = s1.modulo(num1,num2);
        double result_substruct = s1.substruct(num1,num2);
        System.out.println("addition of " + num1 + " " + "and" + " " +
                num2 + " " + "equals to" + " " + result_add);
        System.out.println("modulo of " + num1 + " " + "and" + " " +
                num2 + " " + "equals to" + " " + result_modulo);
        System.out.println("Substruct of " + num1 + " " + "and" +" " +
                num2 + " " + "equals to" + " " + result_substruct);
        System.out.print("Enter first integer number: ");
        int num3 = input.nextInt();
        System.out.print("Enter second integer number: ");
        int num4 = input.nextInt();
        System.out.println("You entered: " + num3 + " " + "and" + " " + num4);
        System.out.println("Or: " + CalculatorProgrammer.or(num3,num4));
        System.out.println("Add: " + CalculatorProgrammer.add(num3,num4));

}
}

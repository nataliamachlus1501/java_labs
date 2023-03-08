package collections_pt2;
import java.util.Scanner;
import java.util.Stack;
//LIFO
public class Main_Stack {
    public static void main(String[] args) {
        Stack<String> bag =  new Stack<>();
        boolean close = false;
        while (!close) {
            System.out.print("If you want to put a product to <bag> enter 'put'.\r\n" +
                    "If you want to take the last added product from <bag> enter 'take'.\r\n" +
                    "If you want to print the content of <bag> enter 'print'.\r\n" +
                    "Enter 'exit' if you want to leave : ");
            Scanner input = new Scanner(System.in);
            String i = input.next();
            switch (i) {
                case "put":
                    System.out.print("Enter the name of product you want to put in bag: ");
                    String p1 = input.next();
                    bag.add(p1);
                    break;
                case "take":
                    String a1 = bag.pop();
                    System.out.print("The product you took from bag is: " + a1 + "\r\n");
                    break;
                case "print":
                    System.out.print(bag + "\r\n");
                    break;
                case "exit":
                    close = true;
                    break;
                default:
                    System.out.println("There is no such a operation");
                    break;
    }
}
}
}

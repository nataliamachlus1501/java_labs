package collections_pt2;
import java.util.HashSet;
import java.util.Scanner;

public class HSet {
    public static void main(String[] args) {
        HashSet<String> bag2 = new HashSet<String>();
        boolean close = false;
        while (!close) {
            System.out.print("If you want to put a product to <bag> enter 'put'.\r\n" +
                    "If you want to take the last added product from <bag> enter 'take'.\r\n" +
                    "If you want to print the content of <bag> enter 'print'.\r\n" +
                    "Enter 'exit' if you want to leave : ");
            Scanner input = new Scanner(System.in);
            String i1 = input.next();
            switch (i1) {
                case "put":
                    System.out.print("Enter the name of product you want to put in bag: ");
                    String p1 = input.next();
                    bag2.add(p1);
                    break;
                case "take":
                    System.out.print("Enter the name of product you want to take from bag");
                    String p2 = input.next();
                    System.out.print("The product you took from bag is: " + bag2.remove(p2) + "\r\n");
                    break;
                case "print":
                    System.out.print(bag2 + "\r\n");
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

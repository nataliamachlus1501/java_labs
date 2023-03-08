package collections_pt2;
import java.util.LinkedList;
import java.util.Scanner;

///FFIFO
public class LinList {
    public static void main(String[] args) {
        LinkedList<String> bag1 = new LinkedList<String>();
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
                    bag1.add(p1);
                    break;
                case "take":
                    System.out.print("The product you took from bag is: " + bag1.remove()+ "\r\n");
                    break;
                case "print":
                    System.out.print(bag1 + "\r\n");
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

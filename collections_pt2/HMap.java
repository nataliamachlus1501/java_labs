package collections_pt2;
import java.util.HashMap;
import java.util.Scanner;

public class HMap {
    public static void main(String[] args){
        HashMap<String,String> h = new HashMap <String,String>();
        //(key,value)
        h.put("Poland","Warszawa");
        h.put("Germany","Berlin");
        h.put("Albania","Tirana");
        h.put("Bulgaria","Sofia");
        h.put("Spain","Madryt");

        System.out.print("Enter the capital city of Poland:");
        Scanner input = new Scanner(System.in);
        String c1 = input.next();
        if(c1.equals(h.get("Poland"))){
            System.out.println("Correct answer. ");
        }else{
            System.out.println("Wrong answer.The correct answer:" + h.get("Poland"));
        }
        System.out.print("Enter the capital city of Germany:");
        String c2 = input.next();
        if(c2.equals(h.get("Germany"))){
            System.out.println("Correct answer. ");
        }else{
            System.out.println("Wrong answer.The correct answer: " + h.get("Germany"));
        }
        System.out.print("Enter the capital city of Albania:");
        String c3 = input.next();
        if(c3.equals(h.get("Albania"))){
            System.out.println("Correct answer. ");
        }else{
            System.out.println("Wrong answer.The correct answer: " + h.get("Albania"));
        }
        System.out.print("Enter the capital city of Bulgaria:");
        String c4 = input.next();
        if(c4.equals(h.get("Bulgaria"))){
            System.out.println("Correct answer. ");
        }else{
            System.out.println("Wrong answer.The correct answer: " + h.get("Bulgaria"));
        }
        System.out.print("Enter the capital city of Spain:");
        String c5 = input.next();
        if(c5.equals(h.get("Spain"))){
            System.out.println("Correct answer. ");
        }else{
            System.out.println("Wrong answer.The correct answer: " + h.get("Spain"));
        }

    }
}

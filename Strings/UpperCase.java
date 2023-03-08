package Strings;

public class UpperCase {
    public static void main(String[] args){
        String strInLowerCase = "funny";
        System.out.println("String before converting to Uppercase:" + " " + strInLowerCase);
        String strInUpperCase = strInLowerCase.toUpperCase();
        System.out.println("String after converting to Uppercase:" + " " + strInUpperCase);
    }
}

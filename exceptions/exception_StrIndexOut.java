package exceptions;
///StringIndexOutOfBoundsException
///Thrown by String methods to indicate that an index is either negative or greater than the size of the string.
// For some methods as the charAt method,this exception also is thrown when the index is equal to the size of the string.
public class exception_StrIndexOut {
    public static void main(String[] args) {
        String s2 = new String("Hello");
        //indeksowanie od 0
        System.out.println(s2.charAt(5));

    }
}

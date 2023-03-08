package exceptions;
///NegativeArraySizeException
///Thrown if an application tries to create an array with negative size.
public class exception_NegArrSize {
    public static void main(String[] args) {
        int[] arr = new int[-10];
    }
}

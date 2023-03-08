package exceptions;
///ArrayIndexOutOfBoundsException
///Thrown to indicate that an array has been accessed with an illegal index.
///The index is either negative or greater than or equal to the size of the array.
public class ArrInOutOf {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,6,9,34};
        System.out.println(arr[5]);
    }
}

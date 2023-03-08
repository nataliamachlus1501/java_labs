package exceptions;
//NullPointerException
///Thrown when an application attempts to use null in a case where an object is required. These include:
///Calling the instance method of a null object.
///Accessing or modifying the field of a null object.
///Taking the length of null as if it were an array.
///Accessing or modifying the slots of null as if it were an array.
///Throwing null as if it were a Throwable value.
public class exc_NullPointer {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.compareTo("java"));
    }
}

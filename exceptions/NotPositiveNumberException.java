package exceptions;

public class NotPositiveNumberException extends Exception{
    String n;
    public NotPositiveNumberException(String n){
        this.n = n;
    }
    public String getMessage(){
        return n;
    }
}

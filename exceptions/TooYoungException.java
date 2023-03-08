package exceptions;

public class TooYoungException extends Exception{
    String s;
    TooYoungException(String s){
        this.s = s;
    }
    public String getMessage(){
        return s;
    }
}

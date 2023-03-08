package exceptions;

public class MyException1 extends Exception{
    String s;
    MyException1(String s){
        this.s = s;
    }
    public String getMessage(){
        return s;
    }
}

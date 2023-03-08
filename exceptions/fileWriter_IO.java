package exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter_IO {
    public static void main(String[] args){
        try {
            FileWriter fw = new FileWriter("J:\\Test.txt");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

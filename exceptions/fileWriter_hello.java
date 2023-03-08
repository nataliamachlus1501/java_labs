package exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter_hello {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Test.txt");
            fw.write("Hello");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

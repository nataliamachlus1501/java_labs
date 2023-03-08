package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Test.txt");
            int i;
            while((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
                fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


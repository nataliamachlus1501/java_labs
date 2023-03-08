package exceptions;

import java.io.FileWriter;
import java.io.IOException;
//FileNotFoundException
///checked exception
public class fileWriter {
    public static void main(String[] args) throws IOException {
        ///FileNotFoundException
        FileWriter fw = new FileWriter("J:\\Text.txt");
    }
}

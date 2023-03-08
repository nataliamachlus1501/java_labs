package threads_pt2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main_Game {
    public static void main(String args[]) throws IOException {
        FileWriter fw = new FileWriter("Game.txt");
        fw.write("jeleń kot buty łasica pies manekin kawa szafa stół tablica\n");
        fw.write("lodówka czajnik dywan mazak drzwi krzesło jezioro zdjęcie zasłony książka\n");
        fw.close();
        boolean close = false;
        while (!close) {
            System.out.print("Czy chciałbyś rozpocząć grę? (tek/nie): ");
            Scanner input = new Scanner(System.in);
            String s1 = input.next();
            switch (s1) {
                case "tak":
                    System.out.println("Masz 10 sekund na zapiamiętanie 10 słów." +
                            "Zaczynamy teraz!(Po każdym wpisanym słowie wpisz enter.)");
                    FileReader fr = new FileReader("Game.txt");
                    int i;
                    while ((i = fr.read()) != -1) {
                        System.out.print((char) i);
                    }
                case "nie":
                    close = true;
                    break;

                default:
                    System.out.println("Nie ma takiej operacji");
                    break;
                    }
            }
        }
    }


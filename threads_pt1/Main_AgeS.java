package threads_pt1;

import java.util.Scanner;

public class Main_AgeS {
    public static void main(String args[]) throws InterruptedException {
        String[] znaki = new String[]{"baran","byk","bliźnięta","rak","lew","panna","waga",
                "skorpion","strzelec","koziorożec","wodnik","ryby"};
        String[] daty = new String[]{"21.03-20.04","21.04-21.05","22.05-21.06","22.06-22.07",
                "23.07-23.08","24.08-22.09","23.09-22.10","23.10-22.11","23.11-21.12","22.12-19.01",
                "20.01-18.02","19.02-20.03"};

        System.out.print("Wpisz datę urodzenia w formacie (dzień-miesiąc-rok): ");
        Scanner input = new Scanner(System.in);
        String date = input.nextLine();
        ZnakThread t1 = new ZnakThread(znaki,daty,date);
        t1.start();
        AgeThread t2 = new AgeThread(znaki,daty,date);
        t2.start();
        t1.join();
        t2.join();
        System.out.println("The End.");
    }
}

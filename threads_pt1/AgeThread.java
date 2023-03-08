package threads_pt1;
///Counts the age given the entered birthdate and then displays it in the console.
import java.util.Calendar;

public class AgeThread extends Thread {
    String[] znaki;
    String[] daty;
    String input;

    AgeThread(String[] znaki, String[] daty, String input) {
        this.znaki = znaki;
        this.daty = daty;
        this.input = input;
    }

    public void run() {
        String a[] = input.split("-");
        int year = Integer.parseInt(a[2]);
        int Age = Calendar.getInstance().get(Calendar.YEAR)-year;
        System.out.println("Masz" + " " + Age + " " + "lat.");
        }
    }


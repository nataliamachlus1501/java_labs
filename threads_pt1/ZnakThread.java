package threads_pt1;
///Displays the astrological sign based on the birthdate.

public class ZnakThread extends Thread {
    String[] znaki;
    String[] daty;
    String input;
    ///constructor
    ZnakThread(String[] znaki, String[] daty, String input) {
        this.znaki = znaki;
        this.daty = daty;
        this.input = input;
    }
    public void run() {
            String[] a = input.split("-");
            int day = Integer.parseInt(a[0]); ///podany przez użytkownika dzień
            int months = Integer.parseInt(a[1]); ///podany przez użytkownika miesiąc
            for (int i = 0; i < daty.length; i++) {
                int day_z1 = Integer.parseInt(daty[i].substring(0, 2));
                int day_z2 = Integer.parseInt(daty[i].substring(6, 8));
                int months_z1 = Integer.parseInt(daty[i].substring(3, 5));
                int months_z2 = Integer.parseInt(daty[i].substring(9, 11));

                if (months == months_z1) {
                    if (day > day_z1) {
                        System.out.println("Twój znak zodiaku to: " + znaki[i]);
                        break;
                    }
                } else if (months == months_z2) {
                    if (day_z2 > day) {
                        System.out.println("Twój znak zodiaku to: " + znaki[i]);
                        break;
                    }
                }
            }

    }
}

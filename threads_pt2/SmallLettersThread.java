package threads_pt2;
///first changes all the capital letters of content to small and displays it in the console.
//Next,counts the number of vowels (e, y, u, i, o, a) in the updated content and displays it in the console.
public class SmallLettersThread extends Thread {
    Text text;

    SmallLettersThread(Text t) {
        this.text = t;
    }

    @Override
    public void run() {

        synchronized (text) {
            text.content = text.content.toLowerCase();
            System.out.println("SmallLetters: " + text.content);

            int count = 0;
            for (int i = 0; i < text.content.length(); i++) {
                if (text.content.charAt(i) == 'a' || text.content.charAt(i) == 'o' ||
                        text.content.charAt(i) == 'u' || text.content.charAt(i) == 'i' ||
                        text.content.charAt(i) == 'e' || text.content.charAt(i) == 'y') {
                    count++;
                }
            }
            System.out.println("No. of vowels: " + count);

            text.slTIsOver = true;
            text.notify();
        }
    }
}

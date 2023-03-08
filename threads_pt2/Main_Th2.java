package threads_pt2;

import threads_pt1.MinThread;

public class Main_Th2 {
    public static void main(String[] args) {

        Text t = new Text("AeuioJJnjkOnlknkjhknkIHOOOOFGHEiunFeRUOI");
        SmallLettersThread slT = new SmallLettersThread(t);
        NoVowelsThread nvT = new NoVowelsThread(t);
        System.out.println("Initial Text: "+t.content);

        slT.start();
        nvT.start();

        try{
            slT.join();
            nvT.join();
        }
        catch(InterruptedException e){
            System.out.println("MainThread is interrupted");
        }
        System.out.println("The End");
    }
}

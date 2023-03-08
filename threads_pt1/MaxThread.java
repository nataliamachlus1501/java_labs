package threads_pt1;

public class MaxThread extends Thread{
    int [] numbers;

    MaxThread(int [] numbers){
        this.numbers = numbers;}

    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }
}

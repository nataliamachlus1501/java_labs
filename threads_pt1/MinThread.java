package threads_pt1;
//the run() method of MinThread first sleeps for 1 second then finds the minimum

public class MinThread extends Thread{
    int [] numbers;

    MinThread(int [] numbers){
        this.numbers = numbers;
    }

    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum value: " + min);
    }
}

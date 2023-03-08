package threads_pt1;

public class Main_minmax {
    public static void main(String args[]) throws InterruptedException {
        long start = System.nanoTime();
        int numbers[] = {1, 2, -6, 12, -3, 80, 18, 27, 4, -6};
        //finding the maximum value in the array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        //suspending the program for 1 second before finding minimum
        Thread.sleep(1000);
        System.out.println(max);

        //finding the minimum value in the array
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        Thread.sleep(1000);
        System.out.println(min);

        long end = System.nanoTime();
        long diff = end - start;
        System.out.println("Execution time: " + diff);

    }
}


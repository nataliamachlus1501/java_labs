package threads_pt1;

public class Main_minmaxThread {
    public static void main(String args[]) throws InterruptedException {
        int numbers[] = {1, 2, -6, 12, -3, 80, 18, 27, 4, -6};
        long start = System.nanoTime();
        MinThread min_t = new MinThread(numbers);
        ///Thread t1 = new Thread(min_t);
        min_t.start();

        MaxThread max_t = new MaxThread(numbers);
        ///Thread t2 = new Thread(max_t);
        max_t.start();
        min_t.join();
        max_t.join();
        long end = System.nanoTime();
        long diff = end - start;
        System.out.println("Execution time: " + diff);
    }
}

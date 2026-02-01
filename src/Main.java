public class Main {
    public static void main(String[] args) {
        System.out.println("Simple Multi-threaded Java Application");
        System.out.println("======================================");
        
        // Create and start multiple threads
        Thread thread1 = new Thread(new Worker("Thread-1", 5));
        Thread thread2 = new Thread(new Worker("Thread-2", 5));
        Thread thread3 = new Thread(new Worker("Thread-3", 5));
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
        
        System.out.println("\nAll threads completed!");
    }
}

class Worker implements Runnable {
    private static final long SLEEP_DURATION_MS = 500;
    private final String name;
    private final int count;
    
    public Worker(String name, int count) {
        this.name = name;
        this.count = count;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println(name + " - Count: " + i);
            try {
                Thread.sleep(SLEEP_DURATION_MS);
            } catch (InterruptedException e) {
                System.err.println(name + " interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println(name + " finished!");
    }
}

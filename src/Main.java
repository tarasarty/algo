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
        }
        
        System.out.println("\nAll threads completed!");
    }
}

class Worker implements Runnable {
    private String name;
    private int count;
    
    public Worker(String name, int count) {
        this.name = name;
        this.count = count;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println(name + " - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.err.println(name + " interrupted: " + e.getMessage());
            }
        }
        System.out.println(name + " finished!");
    }
}

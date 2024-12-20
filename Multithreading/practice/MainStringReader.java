

public class MainStringReader {
    public static void main(String[] args) {
        String input = "123456789";
        
        // Create three threads
        Thread t1 = new Thread(new StringReaderThread(input, 0, "Thread-1"));
        Thread t2 = new Thread(new StringReaderThread(input, 3, "Thread-2"));
        Thread t3 = new Thread(new StringReaderThread(input, 6, "Thread-3"));
        
        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        
        // Wait for all threads to complete
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
}}

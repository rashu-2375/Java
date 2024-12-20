// Producer thread class
class Producer implements Runnable {
    private SharedBuffer buffer;
    
    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.produce(i);
            // try {
            //     Thread.sleep(1000);  // Simulate some processing time
            // } catch (InterruptedException e) {
            //     Thread.currentThread().interrupt();
            // }
        }
    }
}
class MyClass implements Runnable {
  // Override the run() method to define the task for the thread
  public void run() {
    // try {
    // // Pause the current thread for 1 second (1000 milliseconds)
    // Thread.sleep(1000);
    // } catch (InterruptedException e) {
    // // Print stack trace if the thread is interrupted
    // e.printStackTrace();
    // }

    // Print the name of the currently running thread
    System.out.println(Thread.currentThread().getName());
  }

  
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running, iteration " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread iteration " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted: " + e.getMessage());
            }
        }
    }
}
OUTPUT 
  Thread 11 is running, iteration 0
Main thread iteration 0
Thread 11 is running, iteration 1
Main thread iteration 1
Thread 11 is running, iteration 2
Main thread iteration 2
Thread 11 is running, iteration 3
Main thread iteration 3
Thread 11 is running, iteration 4
Main thread iteration 4

  "CODE EXECUTED SUCCESSFULLY "

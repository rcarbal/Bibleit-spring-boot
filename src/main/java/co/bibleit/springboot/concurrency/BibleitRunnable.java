package co.bibleit.springboot.concurrency;

public class BibleitRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Gonna get all the books in a runnable thread");

    }
}
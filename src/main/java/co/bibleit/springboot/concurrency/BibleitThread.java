package co.bibleit.springboot.concurrency;

public class BibleitThread extends Thread {

    @Override
    public void run() {
        System.out.println("Gonna get all the books");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("Another thread woke me up");
        }

        System.out.println("Three seconds have passed.");
    }
}

package co.bibleit.springboot.examples.concurrency_example;

import org.junit.jupiter.api.Test;

/*
    Thread.sleep() will not run on unit test.
 */

public class BibleItThreadTest {

    @Test
    public void runStandardThread(){
        System.out.println("Running a Bibleit Thread");
        Thread bibleItThread = new BibleitThread();
        bibleItThread.start();

        // runs an anonymous thread
        // lambda thread
        // new Thread(() -> System.out.println("Running an anonymous thread.")).start();
        new Thread(){
            public void run(){
                System.out.println("Running an anonymous thread.");
            }
        }.start();
    }

    // Sample of a runnable blass
    @Test
    public void runStandardRunnableThread(){
        System.out.println("Running a Bibleit Runnable Thread");

        Thread runnableThread = new Thread(new BibleitRunnable());
        runnableThread.start();

        Thread anonymousRunnable = new Thread(new BibleitRunnable(){
            @Override
            public void run() {
                System.out.println("Running a anonymous Bibleit Runnable instance.");
            }
        });
        anonymousRunnable.start();
    }
}

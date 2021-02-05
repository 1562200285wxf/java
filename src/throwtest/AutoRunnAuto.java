package throwtest;

import java.util.concurrent.atomic.AtomicInteger;

public class AutoRunnAuto implements Runnable{

    private AtomicInteger atomicInteger = new AtomicInteger();

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"=="+getAuto());
    }
    public int getAuto() {
        return atomicInteger.getAndIncrement();
    }
}

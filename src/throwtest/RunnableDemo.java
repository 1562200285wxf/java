package throwtest;

public class RunnableDemo implements  Runnable{
    private volatile boolean falg = false;
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
        falg = true;
        System.out.println("falg="+falg);
    }

    public boolean isFalg() {
        return falg;
    }

    public void setFalg(boolean falg) {
        this.falg = falg;
    }
}

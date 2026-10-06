package AulasJava.AulasJava.JavaCore.ZZFthreads.test;

class ThreadExempleRunnable2 implements Runnable{
    private String c;
    public ThreadExempleRunnable2(String c) {
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
            Thread.yield();

        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExempleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExempleRunnable2("Me"));

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();


    }
}

package AulasJava.AulasJava.JavaCore.ZZFthreads.test;

class ThreadExemple extends Thread {
    private char c;

    public ThreadExemple(char c) {
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

        }
    }
}

class ThreadExempleRunnable implements Runnable{
    private char c;

    public ThreadExempleRunnable(char c) {
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
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
//        ThreadExemple t1 = new ThreadExemple('a');
//        ThreadExemple t2 = new ThreadExemple('b');
//        ThreadExemple t3 = new ThreadExemple('c');
//        ThreadExemple t4 = new ThreadExemple('d');

        Thread t1 = new Thread(new ThreadExempleRunnable('a'), "T1A");
        Thread t2 = new Thread(new ThreadExempleRunnable('b'), "T2B");
        Thread t3 = new Thread(new ThreadExempleRunnable('c'), "T3C");
        Thread t4 = new Thread(new ThreadExempleRunnable('d'), "T4D");

        t4.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

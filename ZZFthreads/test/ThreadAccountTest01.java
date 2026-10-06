package AulasJava.AulasJava.JavaCore.ZZFthreads.test;

import AulasJava.AulasJava.JavaCore.ZZFthreads.dominio.Account;

import javax.sound.midi.Track;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();
    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");

        t1.start();
        t2.start();


    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawl(10);
            if(account.getBalance() < 0){
                System.out.println("Fodeo");
            }
        }

    }

    private void withdrawl (int amount) {
        synchronized (account) {
            System.out.println(getThreadName() + " dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " Sacando Dinheiro");
                account.withdrawl(amount);
                System.out.println(getThreadName() + "C ompletou o saque valor atual :" + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque" + account.getBalance());
            }

        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}

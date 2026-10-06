package AulasJava.AulasJava.JavaCore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTranferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Gabriel"));
        System.out.println(tq.offer("Gabriel"));
        if (tq.hasWaitingConsumer()){
            tq.transfer("Developer");
        }
        System.out.println(tq.offer("Gabriel", 10, TimeUnit.SECONDS));
        System.out.println(tq.element());

    }
}

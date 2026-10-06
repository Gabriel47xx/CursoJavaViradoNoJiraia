package AulasJava.AulasJava.JavaCore.ZZGconcorrencia.test;

import AulasJava.AulasJava.JavaCore.ZZGconcorrencia.service.StoreService;
import AulasJava.AulasJava.JavaCore.ZZGconcorrencia.service.StoreServiceDepecrated;

import java.util.concurrent.ExecutionException;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDepecrated storeServiceDepecrated = new StoreServiceDepecrated();
//      searchPriceSync(storeService);
//        searchPricesAsyncFuture(storeServiceDepecrated);
    }

    private static void searchPriceSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d %n", (end - start));
    }
    private static void searchPricesAsyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        try {
            storeService.getPricesAsyncFuture("Store 1").get();
            storeService.getPricesAsyncFuture("Store 2").get();
            storeService.getPricesAsyncFuture("Store 3").get();
            storeService.getPricesAsyncFuture("Store 4").get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d %n", (end - start));
        StoreService.shutdown();
    }
}

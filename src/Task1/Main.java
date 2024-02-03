package Task1;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long startProgramme = System.currentTimeMillis();
        Thread oneSecondPrint =new Thread(()-> {
            try {

                while (Thread.currentThread().isAlive()) {
                    Thread.currentThread().sleep(1000);
                    System.out.println("Минуло "+(System.currentTimeMillis()-startProgramme)+" з моменту запуску програми");

                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        oneSecondPrint.start();

        ScheduledExecutorService fiveSecondPrint = Executors.newSingleThreadScheduledExecutor();
        fiveSecondPrint.scheduleAtFixedRate(()-> System.out.println("Минуло 5 секунд"),5,5, TimeUnit.SECONDS);
    }
}

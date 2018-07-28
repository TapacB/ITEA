package tenlesson;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) throws InterruptedException{
//        DemoThread producer=new DemoThread();
//        Thread prod=new Thread(producer);
//        producer.run();
//
//        StringProducer sp=new StringProducer();
//        try{
//            TimeUnit.SECONDS.sleep(2);
//        }catch (Exception e){}
//        StringKeeper sk=new StringKeeper();
        ExecutorService es=Executors.newFixedThreadPool(1);
        CountDownLatch cdl=new CountDownLatch(5);
        CountDownLatch cdl2=new CountDownLatch(5);
        CountDownLatch cdl3=new CountDownLatch(5);
        es.execute( new DemoThread("A", cdl));
       // TimeUnit.SECONDS.sleep(2);
        es.execute(new DemoThread("B", cdl2));
       // TimeUnit.SECONDS.sleep(2);
        es.execute(new DemoThread("C", cdl3));
        es.shutdown();

        cdl.await();
        cdl2.await();
        cdl3.await();

    }
}

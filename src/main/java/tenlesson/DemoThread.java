package tenlesson;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class DemoThread implements Runnable{

    private String name="";
    CountDownLatch cdl;

    public DemoThread(String name, CountDownLatch cdl) {
        this.name = name;
        this.cdl = cdl;
        new Thread(this).run();
    }


    public void run() {
        for(int i=0; i<5;i++){
            System.out.println(name+" : "+i);
           cdl.countDown();
        }
    }
}



package tenlesson;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Dog implements Callable<String> {

    String s;
    int sleep;

    public Dog(String s, int sleep) {
        this.s = s;
        this.sleep = sleep;
    }

    public String call() throws Exception {
        TimeUnit.SECONDS.sleep(sleep);
        return s;
    }
}

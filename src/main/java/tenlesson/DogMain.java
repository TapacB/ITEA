package tenlesson;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DogMain {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es=Executors.newFixedThreadPool(3);
        Future<String> F1;
        Future<String> F2;
        Future<String> F3;
        System.out.println("Start");
        F1=es.submit(new Dog("DOggy", 2));
        F2=es.submit(new Dog("Catty", 3));
        F3=es.submit(new Dog("Piggy", 2));
        System.out.println(F1.get());
        System.out.println(F2.get());
        System.out.println(F3.get());

        //es.execute(new Dog("DOggy", 2));
    }
}

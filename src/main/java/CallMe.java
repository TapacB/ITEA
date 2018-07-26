import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class CallMe {
   void getString(String msg) throws InterruptedException{
        System.out.print("{ "+ msg);
        TimeUnit.SECONDS.sleep(1);
        System.out.print("}");
    }

}

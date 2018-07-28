package tenlesson;

import java.util.concurrent.TimeUnit;

public class StringProducer implements Runnable {


    String str="";

    public void run(){
        for(int i=0; i<5;i++){
            for(int j=0; j<5;j++){
                str+=(char)((int)(Math.random()*63+65));
            }
            System.out.println(str);
            str="";
            try{
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

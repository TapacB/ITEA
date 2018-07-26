import sun.invoke.empty.Empty;

import java.util.Random;

public class MyThread extends Thread{



    String name;
    Thread th;
    String a="";
    char step='-';
    Random rand = new Random();
    int  n = rand.nextInt(3) ;

    public MyThread(String name){
    this.name=name;
//    th=new Thread(this);
//    th.start();
    start();
    }



    public Thread getTh(){
        return th;
    }


    public void steps(){
        for(int i=0;i<n;i++){
            //a += step;
             }
            while (a.length() < 20) {
                a+= step;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(name + " " + a);
            }



    }

    @Override
    public void run(){
}
}

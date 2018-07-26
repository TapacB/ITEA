public class Main {

    public static void main(String[] args) throws InterruptedException{
        MyThread thread=new MyThread("A");
        MyThread thread2=new MyThread("B");
//        Thread tA=new Thread(thread);
//        Thread tB=new Thread(thread2);
//        tA.setPriority(Thread.MIN_PRIORITY);
//        tB.setPriority(Thread.MAX_PRIORITY);
//          tA.start();
//          tB.start();
//        thread.run();
           thread.steps();
           thread2.steps();


           while(thread.isAlive() && thread2.isAlive()) {
               if (!thread2.isAlive()) {
                   System.out.println("B win");
               } if(!thread.isAlive()){
                   System.out.println("A win");
               }
           }




       // MyThread mt= new MyThread("A");
//        Thread t=mt.getTh();
//        Thread.sleep(5);
        //System.out.println(tA.isAlive());
        System.out.println(Thread.activeCount());




    }
}

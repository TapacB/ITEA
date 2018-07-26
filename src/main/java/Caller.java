public class Caller extends Thread {

    CallMe callMe;
    String msg;

    public Caller(CallMe callMe, String msg){
        this.callMe=callMe;
        this.msg=msg;
        start();
    }

    @Override
    public void run(){
        try{
            synchronized (callMe){
        callMe.getString(msg);
            }
        }catch (InterruptedException e){}

    }
}

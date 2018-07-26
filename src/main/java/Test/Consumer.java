package Test;

public class Consumer extends Thread {

    Q q;
    public Consumer(Q q){
        this.q=q;
        start();

    }

    @Override
    public void run(){
        while(true ){
            q.getN();
        }
    }
}

package Test;

public class Producer extends Thread {
    Q q;
    public Producer(Q q){
        this.q=q;
        start();
    }

    @Override
    public void run(){
        int i=1;
        while(true){
            q.putN(i++);
        }
    }
}

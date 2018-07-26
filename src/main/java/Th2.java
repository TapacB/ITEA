public class Th2 extends Thread{

    Shared shared;

    public Th2(Shared shared){
        this.shared=shared;
        start();
    }

    @Override
    public void run(){
        while(true){
            synchronized (shared) {
                if (shared.x%2==0) {
                    System.out.println(shared.x);
                }

            }
        }

    }
}

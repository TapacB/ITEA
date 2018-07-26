public class Th1 extends Thread {

    Shared shared;

    public Th1(Shared shared){
        this.shared=shared;
        start();
    }

    @Override
    public void run() {

        while (true) {
            synchronized (shared) {
                shared.x++;
            }
        }

    }
}

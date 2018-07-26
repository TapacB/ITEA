package Test;

public class Q {
    int n=0;

    int getN(){
       int temp=n;
       this.n=0;
        System.out.println("Get: "+temp);
      return  temp;
    }

    void putN(int n){
        this.n=n;
        System.out.println("Put: "+n);
    }
}

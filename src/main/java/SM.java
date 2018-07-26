import jdk.nashorn.internal.codegen.CompilerConstants;

public class SM {

    public static void main(String[] args){
        Shared shared=new Shared(0);
        new Th1(shared);
        new Th2(shared);

//        CallMe c=new CallMe();
//        new Caller(c,"a");
//        new Caller(c,"b");
//        new Caller(c,"c");
    }
}

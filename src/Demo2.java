public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        Demo d=new Demo();
        Thread t1=new Thread(d);
        Thread t2=new Thread(d);

        t1.start();
        t1.join();
        t2.start();
        for(int x=0;x<50;x++){
           // System.out.println(Thread.currentThread().toString()+x);
        }
    }
}
class Demo implements Runnable{
    public void run(){
        for(int x=0;x<50;x++){
            System.out.println(Thread.currentThread().toString()+x);
            Thread.yield();
        }
    }
}

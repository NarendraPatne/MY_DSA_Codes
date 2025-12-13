public class MultThR implements Runnable {
    public void run(){
        for(int i=1;i<=10;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        MultThR th=new MultThR();
        Thread t=new Thread(th);
        t.start();
    }
}

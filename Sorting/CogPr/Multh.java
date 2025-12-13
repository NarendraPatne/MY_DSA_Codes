public class Multh extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        Multh t1=new Multh();
        Multh t2=new Multh();
        t1.setName("Thread A");
        t2.setName("Thread B");
        t1.start();
        t2.start();
    }
}

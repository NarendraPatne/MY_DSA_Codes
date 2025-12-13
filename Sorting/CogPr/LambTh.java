public class LambTh {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            for(int i=1;i<=10;i++)
            {
                System.out.println(i);
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1;i<=10;i++)
            {
                System.out.println(i);
            }
        });
        t.start();
        t2.start();
    }
}

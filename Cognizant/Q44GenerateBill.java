public class Q44GenerateBill {
    public static int getSnackBill(int pizza,int puff,int cDrink)
    {
        return (pizza*100)+(puff*20)+(cDrink*10);
    }
    public static void main(String[] args) {
        System.out.println(getSnackBill(10, 12, 5));
    }
}

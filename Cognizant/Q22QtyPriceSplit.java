public class Q22QtyPriceSplit {
    public static int getTotalStockValue(String S) {
        String[] products = S.split(";");
        int totalValue = 0;
        for (String product : products) {
            String[] parts = product.split(":");
            int price = Integer.parseInt(parts[1]);
            int qty = Integer.parseInt(parts[2]);
            totalValue += qty * price;
        }
        return totalValue;
    }

    public static void main(String[] args) {
        String S = "Apple:250:10;Banana:120:15;Orange:300:5";
        System.out.println(getTotalStockValue(S));
    }
}

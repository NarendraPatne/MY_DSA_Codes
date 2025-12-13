public class Q39AmazonCrypto {
    public static String getCryptographedBarcode(String order,int c)
    {
        StringBuilder sb=new StringBuilder();
        for(char ch:order.toCharArray()){
            int val=ch-'0';
            val+=c;
            if(val<10)
            {
                sb.append(val);
            }else{
                char e=(char)('A'+val-10);
                sb.append(e);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String order="46734";
        System.out.println(getCryptographedBarcode(order, 2));
    }  
}

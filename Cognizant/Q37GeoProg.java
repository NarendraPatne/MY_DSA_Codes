public class Q37GeoProg {
    public static double getGeometricProgressionNthTerm(int a,int r,int n)
    {
        return a*Math.pow(r,n-1);
    }
    public static void main(String[] args) {
        System.out.println((int)getGeometricProgressionNthTerm(2, 3, 6));
    }
}

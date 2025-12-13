public class Exc {
    public static void main(String[] args) {
        try{
            int a=10,b=0;
            System.out.println(a/b);
            int arr[]={1,2,3};
            System.out.println(arr[4]);
        }catch(ArithmeticException e){
            System.out.println("Error: Cant divide by Zero"+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Exception"+e.getMessage());
        }
        finally{
            System.out.println("Finally Block Executed");
        }
    }
}

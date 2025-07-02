public class Fact {
    public static int factorial(int n)
    {
        // Base Case for stopping the recursion calls. 
        if(n==0){
            return 1;
        }
        // Recursive Case (Recursive call with problem reduced or subproblem)
        // Recurrance Relation for factorial: f(n)=n*f(n-1)
        // In recurrance relation : smaller problem is f(n-1)
        int smallProb=factorial(n-1);
        // In recurrance relation : big problem is n*f(n-1) i.e. n*smallerProb;
        int bigProblem=n*smallProb;
        // In end we return the big problem solved ans.
        return bigProblem;
    }
    public static int pow(int n,int p)
    {
        if(p==0)
        {
            return 1;
        }else{
            return n*pow(n, p-1);
        }
    }
    public static int factorial2(int n)
    {
        // Base Case for stopping the recursion calls. 
        if(n==0){
            return 1;
        }else{
        // ----------------------------------------
        // We can combine all the statements together 
        // We were returning the big problem in the end
        // So we write the return statement for bigproblem without storing it in any variable
        // bigProblem=n*smallProb & smallProb=factorial(n-1)
        return n*factorial(n-1);
        }

    }
    public static int pow2(int p)
    {
        // Tail recursion
        if(p==0)
        {
            return 1;
        }
        int smallProb=pow2(p-1);
        int bigProb=2*smallProb;
        return bigProb;
        // We can write above code in one statement;
        //     return 2*pow2(p-1);
    }
    public static void printNo(int n)
    {
        // Base Case
        if(n==0)
            return;
        // Processing/ Operation
        System.out.print(n+" ");
        // Reecursive Case
        printNo(n-1);
    }
    public static int sumOfSeries(int n) {
        // code here
        // System.out.println(n);
        if(n==0)
        {
            return 0;
        }
        System.out.println((int)Math.pow(n,3)+sumOfSeries(n-1));
        return (int)Math.pow(n,3)+sumOfSeries(n-1);
    }
    public static void main(String[] args) {
        // System.out.println(factorial(5));
        // System.out.println(factorial2(5));
        // System.out.println(pow(2, 3));
        // System.out.println(pow2(5));
        // printNo(10);
        sumOfSeries(5);
    }
}

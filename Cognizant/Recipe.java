public class Recipe {

    public static String decodeRecipe(int N, int[] Q, int M, int[] I) {
        // Use StringBuilder for efficient string concatenation in a loop.
        StringBuilder recipeString = new StringBuilder();

        // Determine the length of the longer array to set the loop bounds.
        int maxLength = Math.max(N, M);

        // Loop from 0 to the end of the longer array.
        for (int i = 0; i < maxLength; i++) {
            // If the current index is valid for the quantities array, append the quantity.
            if (i < N) {
                recipeString.append(Q[i]+" ");
            }

            // If the current index is valid for the ingredients array, append the ingredient code.
            if (i < M) {
                recipeString.append(I[i]+" ");
            }
        }

        // Convert the StringBuilder to a String and return it.
        return recipeString.toString();
    }

    public static void main(String[] args) {
        // Example 1: N > M
        int N1 = 3;
        int[] Q1 = {100, 250, 50};
        int M1 = 2;
        int[] I1 = {404, 512};
        // Expected output: "10040425051250"
        System.out.println("Test Case 1:");
        System.out.println("Quantities: {100, 250, 50}, Ingredients: {404, 512}");
        System.out.println("Decoded Recipe: " + decodeRecipe(N1, Q1, M1, I1));
        System.out.println("--------------------");

        // Example 2: M > N
        int N2 = 2;
        int[] Q2 = {2, 5};
        int M2 = 4;
        int[] I2 = {10, 20, 30, 40};
        // Expected output: "2105203040"
        System.out.println("Test Case 2:");
        System.out.println("Quantities: {2, 5}, Ingredients: {10, 20, 30, 40}");
        System.out.println("Decoded Recipe: " + decodeRecipe(N2, Q2, M2, I2));
        System.out.println("--------------------");

        // Example 3: N = M
        int N3 = 2;
        int[] Q3 = {500, 1};
        int M3 = 2;
        int[] I3 = {99, 88};
        // Expected output: "50099188"
        System.out.println("Test Case 3:");
        System.out.println("Quantities: {500, 1}, Ingredients: {99, 88}");
        System.out.println("Decoded Recipe: " + decodeRecipe(N3, Q3, M3, I3));
        System.out.println("--------------------");
        
        // Example 4: One array is empty
        int N4 = 0;
        int[] Q4 = {};
        int M4 = 3;
        int[] I4 = {1, 2, 3};
        // Expected output: "123"
        System.out.println("Test Case 4:");
        System.out.println("Quantities: {}, Ingredients: {1, 2, 3}");
        System.out.println("Decoded Recipe: " + decodeRecipe(N4, Q4, M4, I4));
        System.out.println("--------------------");
    }
}
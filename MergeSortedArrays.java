
    
import java.util.Arrays;

public class MergeSortedArrays {

    public static int[] mergeSortedArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        
        // Resultant array to store the merged output
        int[] C = new int[n + m];
        
        int i = 0, j = 0, k = 0;
        
        // Merge elements from both arrays while both have elements left
        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        
        // If any elements remain in A, copy them
        while (i < n) {
            C[k++] = A[i++];
        }
        
        // If any elements remain in B, copy them
        while (j < m) {
            C[k++] = B[j++];
        }
        
        return C;
    }

    public static void main(String[] args) {
        // Example arrays
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8, 9};
        
        // Merging arrays A and B
        int[] C = mergeSortedArrays(A, B);
        
        // Print the merged array
        System.out.println("Merged array: " + Arrays.toString(C));
    }
}


//Shell Sort
public class DSA11_shellSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 3, 7, 6, 2, 4, 1};
        int n = arr.length;
         for(int gap = n/2 ; gap > 0 ; gap = gap/2)
         {
            for(int i = gap ; i < n ; i++)
            {
                int temp = arr[i];
                int j = i;
                while(j >= gap && arr[j-gap] > temp)
                {
                    arr[j] = arr[j-gap];
                    j = j-gap;
                }
                arr[j] = temp;
            }
         }

         for(int x : arr)
         {
            System.out.print(x+ " ");
         }

    }
}

// ============================================================
// SHELL SORT
// ============================================================

// Definition:
// Shell Sort is an improved version of Insertion Sort that
// compares elements at a certain gap and gradually reduces
// the gap until it becomes 1.

// Time Complexity:
// Best Case    : Depends on the gap sequence
// Average Case : Depends on the gap sequence
// Worst Case   : O(n^2) -> For the simple gap sequence n/2, n/4,...

// Space Complexity:
// O(1)

// Limitations:
// 1. Performance depends heavily on the gap sequence.
// 2. Not a stable sorting algorithm.
// 3. Can have O(n^2) worst-case time with simple gap sequences.
// 4. More complex than basic sorting algorithms.

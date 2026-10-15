//Heap Sort
public class DSA10_heapSort {

    public static void main(String[] args) {

        int A[] = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};

        heapSort(A);

        // Print sorted array
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    // Heap Sort
    static void heapSort(int A[]) {

        // Step 1: Build Max Heap
        buildMaxHeap(A);

        // Step 2: Move largest element to the end
        for (int i = A.length - 1; i > 0; i--) {

            // Swap root with last element
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;

            // Heap size becomes smaller
            heapify(A, i, 0);
        }
    }

    // Build Max Heap
    static void buildMaxHeap(int A[]) {

        int n = A.length;

        // Start from last non-leaf node
        for (int i = (n / 2) - 1; i >= 0; i--) {

            heapify(A, n, i);
        }
    }

    // Heapify
    static void heapify(int A[], int heapSize, int i) {

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < heapSize && A[left] > A[largest]) {
            largest = left;
        }

        // Check right child
        if (right < heapSize && A[right] > A[largest]) {
            largest = right;
        }

        // If child is larger than parent
        if (largest != i) {

            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;

            // Continue heapifying
            heapify(A, heapSize, largest);
        }
    }
}

// ============================================================
// HEAP SORT
// ============================================================

// Definition:
// Heap Sort builds a heap from the array and repeatedly removes
// the largest element (Max Heap) or smallest element (Min Heap)
// to produce the sorted array.

// Time Complexity:
// Best Case    : O(n log n)
// Average Case : O(n log n)
// Worst Case   : O(n log n)

// Space Complexity:
// O(1) -> When heapify is implemented iteratively

// Limitations:
// 1. Not a stable sorting algorithm.
// 2. Usually has less cache-friendly memory access patterns.
// 3. Can be slower in practice than Quick Sort for many datasets.
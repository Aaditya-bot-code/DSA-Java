public  class DSA5_sorting {
    //Bubble Sort
    //Insertion Sort
    //Selection Sort
    public static void main(String[] args) {
        int arr[]={7,4,6,2,5};
        int size=arr.length;
        //bubbleSort(arr,size);
        //selectionSort(arr,size);
        insertionSort(arr,size);
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
    static void bubbleSort(int arr[],int size)
    {
        boolean swapped=false;
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
            {
                break;
            }

        }
        
    }
    static void selectionSort(int arr[],int size)
    {
        for(int i=0;i<size-1;i++)
        {
            int min=i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;

                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    static void insertionSort(int arr[],int size)
    {
        for(int i=1;i<size;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;

        }
    }
    
}

// ============================================================
// BUBBLE SORT
// ============================================================

// Definition:
// Bubble Sort repeatedly compares adjacent elements and swaps
// them if they are in the wrong order. After each pass, the
// largest unsorted element moves to its correct position.

// Time Complexity:
// Best Case    : O(n)      -> Array is already sorted
// Average Case : O(n^2)
// Worst Case   : O(n^2)

// Space Complexity:
// O(1)

// Limitations:
// 1. Very slow for large datasets.
// 2. Requires many comparisons and swaps.
// 3. Not suitable for large-scale sorting.

// ============================================================
// SELECTION SORT
// ============================================================

// Definition:
// Selection Sort repeatedly finds the smallest element from the
// unsorted portion and places it at the beginning of that portion.

// Time Complexity:
// Best Case    : O(n^2)
// Average Case : O(n^2)
// Worst Case   : O(n^2)

// Space Complexity:
// O(1)

// Limitations:
// 1. Always takes O(n^2) time.
// 2. Not efficient for large datasets.
// 3. Performs poorly compared with advanced sorting algorithms.

// ============================================================
// INSERTION SORT
// ============================================================

// Definition:
// Insertion Sort builds the sorted array one element at a time
// by taking each element and inserting it into its correct
// position in the already sorted portion.

// Time Complexity:
// Best Case    : O(n)      -> Array is already sorted
// Average Case : O(n^2)
// Worst Case   : O(n^2)

// Space Complexity:
// O(1)

// Limitations:
// 1. Slow for large and randomly arranged datasets.
// 2. Can require many shifts in the worst case.
// 3. Not suitable for large datasets.

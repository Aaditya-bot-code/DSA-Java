public class DSA7_quickSort {
    //Quick Sort
    public static void main(String[] args) {
        int arr[]={4,2,7,3,9,5};
        quickSort(arr,0,arr.length-1);
        System.out.println("sorted Array:");
        for(int i :arr)
        {
            System.out.println(i+" ");
        }

    }
    public static void quickSort(int arr[],int low,int high)
    {
        if(low<high)
        {
        int pi=partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
        }
}
    public static int partition(int arr[],int low,int high)
    {
        int i=low-1;
        int j=low;
        int temp;
        while(j<high)
        {
           if(arr[j]<arr[high]) 
           {
            i++;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           }
           j++;
        }
        temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}

// ============================================================
// QUICK SORT
// ============================================================

// Definition:
// Quick Sort uses the divide-and-conquer technique. It selects
// a pivot and partitions the array so that smaller elements are
// placed on one side and larger elements on the other side.
// It then recursively sorts both parts.

// Time Complexity:
// Best Case    : O(n log n)
// Average Case : O(n log n)
// Worst Case   : O(n^2)

// Space Complexity:
// Average Case : O(log n) -> Recursion stack
// Worst Case   : O(n)     -> Recursion stack

// Limitations:
// 1. Worst-case time complexity can be O(n^2).
// 2. Performance depends on pivot selection.
// 3. Poor pivot selection can create highly unbalanced partitions.

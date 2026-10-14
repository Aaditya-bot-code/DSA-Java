public class DSA6_mergeSort {
    //Merge Sort
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 7, 1, 6, 4};
        mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted Array:\n");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
     public static void mergeSort(int arr[],int low,int high)
    {
        if(low>=high)
        {
            return ;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[],int low,int mid,int high)
    {
        int i=low;
        int j=mid+1;
        int k=0;
        int temp[]=new int[high-low+1];
        while(i<=mid && j<=high)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=high)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(i=0;i<temp.length;i++)
        {
            arr[low+i]=temp[i];
        }

    }
}

// ============================================================
// MERGE SORT
// ============================================================

// Definition:
// Merge Sort uses the divide-and-conquer technique. It repeatedly
// divides the array into smaller parts, sorts those parts, and
// merges the sorted parts to produce the final sorted array.

// Time Complexity:
// Best Case    : O(n log n)
// Average Case : O(n log n)
// Worst Case   : O(n log n)

// Space Complexity:
// O(n)

// Limitations:
// 1. Requires extra memory for merging.
// 2. Not an in-place sorting algorithm for arrays.
// 3. Can have more overhead than simpler sorting algorithms
//    for small datasets.s

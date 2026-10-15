public class DSA9_radixSort {
    //Radix Sort
    public static void radixSort(int arr[])
    {
        int max=arr[0];
        for(int  i= 0;i<arr.length; i++)
        {
            if(max < arr[i])
            {
                max=arr[i];
            }
        }
        for(int exp= 1;(max/exp)>0;exp*=10)
        {
            countSort(arr,exp);
        }
    }
    public  static void countSort(int arr[],int exp)
    {
        int n=arr.length;
        int output[]=new int[n];
        int count[]=new int[10];
        for(int i=0;i<n;i++)
        {
            int digit=(arr[i]/exp)%10;
            count[digit]++;
        }
        for(int i=1;i<10;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        for(int i=n-1;i>=0;i--)
        {
            int digit=(arr[i]/exp)%10;
            output[count[digit]-1]=arr[i];
            count[digit]--;

        }
        for(int i=0;i<n;i++)
        {
            arr[i]=output[i];
        }

    }
    public static void main(String[] args) {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr);

        System.out.println("Sorted array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    
}

// ============================================================
// RADIX SORT
// ============================================================

// Definition:
// Radix Sort sorts numbers digit by digit, starting from the
// least significant digit and moving toward the most significant
// digit. It commonly uses Counting Sort for each digit.

// Time Complexity:
// Best Case    : O(d × (n + k))
// Average Case : O(d × (n + k))
// Worst Case   : O(d × (n + k))
//
// n = Number of elements
// d = Number of digits
// k = Range of each digit (usually 10 for decimal numbers)

// Space Complexity:
// O(n + k)

// Limitations:
// 1. Mainly suitable for numbers or data that can be processed
//    digit by digit.
// 2. Requires extra memory.
// 3. Performance depends on the number of digits.
// 4. More complicated than simple comparison-based sorting.

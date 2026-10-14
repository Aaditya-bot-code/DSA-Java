public class DSA8_countingSort {
    //Counting Sort
    public static void main(String[] args) {
        int arr[]={12,15,12,13,14,15};
        int min=arr[0],max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
            else if(max<arr[i])
            {
                 max=arr[i];
            }
        }
        int count_arr[]=new int[max-min+1];
        for(int i=0;i<arr.length;i++)
        {
            count_arr[arr[i]-min]++;
        }
        int index=0;
        for(int i=0;i<count_arr.length;i++)
        {
            int act_value=i+min;
            int j=0;
            while(j<count_arr[i])
            {
                arr[index+j]=act_value;
                j++;
            }
            index+=j;
            
        }
        for(int i :arr)
        {
            System.out.println(i+" ");

        }
    }
}

// ============================================================
// COUNTING SORT
// ============================================================

// Definition:
// Counting Sort counts the frequency of each value and uses those
// counts to place the elements in their correct sorted positions.

// Time Complexity:
// Best Case    : O(n + k)
// Average Case : O(n + k)
// Worst Case   : O(n + k)
//
// n = Number of elements
// k = Range of values

// Space Complexity:
// O(n + k)

// Limitations:
// 1. Mainly suitable for integers or discrete values.
// 2. Requires extra memory.
// 3. Becomes inefficient when the value range (k) is very large.
// 4. Not suitable for arbitrary data without modification.

import java.util.*;
public class DSA1_checkSorted {
    //Array sorted or not?
    public static void main(String[] args) {
        int[] arr={5,10,15,20};
        Scanner s=new Scanner(System.in);
        int l=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                System.out.println("Array is not Sorted !");
                l=1;
                break;
            }
        }
        if(l==0)
        {
            System.out.println("Array is Sorted");
        }
        s.close();
    }
}

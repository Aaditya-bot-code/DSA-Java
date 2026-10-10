public class DSA2_binarySearch {
    //Binary Search
    public static void main(String[] args) {
        int arr[]={5,10,15,20,25,30,35,40,45,50};
        int mid,low=0;
        int high=arr.length-1;
        int l=0,target=5;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                System.out.println("Element found at "+(mid+1)+" position");
                l=1;
                break;
            }
            else if(arr[mid]<target)
            {
            low=mid+1;
            }
            else
            {
                high=mid-1;
            }
            
        }
        if(l==0)
        {
            System.out.println("Element not found");
        }
    }
    
}

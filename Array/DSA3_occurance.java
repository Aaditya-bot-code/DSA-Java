public class DSA3_occurance {
    //Fist Occurance
    //Last Ocurrance
    //Count Occurance
    public static void main(String[] args) {
        int arr[]={10,20,20,20,30,40};
        int target=20;
        int first= firstOccurence(arr, target);
        int last=lastOccurence(arr, target);
        countOccurence(first,last);
    }
     public static int firstOccurence(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        int answer=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(target==arr[mid])
            {
                answer=mid;
                high=mid-1;
                continue;
            }
            else if(target>arr[mid])
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return answer;
        
    }
    public static int lastOccurence(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        int answer=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(target==arr[mid])
            {
                answer=mid;
                low=mid+1;
                continue;
            }
            else if(target>arr[mid])
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return answer;
        
    }
    public static void countOccurence(int first,int last)
    {
        if(first==-1)
        {
            System.out.println("target not found");
        }
        else{
        int count=last-first+1;
        System.out.println("no of occurence: "+count);
        }
    }

}


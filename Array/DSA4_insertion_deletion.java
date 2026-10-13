public class DSA4_insertion_deletion {
    //Array Insertion
    //Array Deletion
    public static void main(String[] args) {
        int []arr=new int[10];
        arr[0]=5;
        arr[1]=10;
        arr[2]=15;
        arr[3]=20;
        arr[4]=25;
        int index=2;
        int size=5;
        System.out.println("Original Array:");
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int newSize=arrayInsertion(arr,index,size);
        arrayDeletion(arr,index,newSize);
        
}
public static int arrayInsertion(int arr[],int index,int size)
{
    int insert=12;
    for(int i = size; i > index ; i--)
        {
            arr[i]=arr[i-1];
        }
        arr[index]=insert;
        size++;
        System.out.println("Inserted Element: "+insert);
        System.out.println("Updated Array Is:");
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return  size;
        
}
public  static void arrayDeletion(int arr[],int index,int size)
{   
    int delete=arr[index];
    for(int i =index; i < size-1 ; i++)
    {
        arr[i]=arr[i+1];
    }
    size--;
    System.out.println("Deleted Element: "+delete);
    System.out.println("Updated Array Is:");
    for(int i = 0 ; i < size ; i++)
    {
        System.out.print(arr[i]+" ");
    }
        
}
}

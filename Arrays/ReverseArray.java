public class ReverseArray {
    public static void main(String[] args)
    {
        int arr[]={5,6,3,8,5};
        int size=arr.length;
        int temp=0;//  for swapping elements
        for(int i=0;i<(size-1)/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temp;
        }
        for(int tmp:arr)// foreach loop
        {
            System.out.println(tmp);
        }
    } 
    
}
//time complexity O(n)
//space complexiyt O(1)


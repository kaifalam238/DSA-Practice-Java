//time complexity O(n)
//Space complexity O(1)
import java.util.Scanner;
public class ispalindrome
{
    public boolean IsPalindrome(int arr[])
    {
        int size=arr.length-1;
        for(int i=0;i<size/2;i++)
        {
            if(arr[i]!=arr[size-i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int arry[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arry.length;i++)
        {
            int var=sc.nextInt();
            arry[i]=var;
        }
        sc.close();
        ispalindrome isp=new ispalindrome();
         if(isp.IsPalindrome(arry))
         {
            System.out.println("Palindrome");
         }
         else
         System.err.println("Note Palindrome");
    }
}

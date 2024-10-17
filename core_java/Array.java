import java.util.* ;
public class Array{
 public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt() ;
  int arr[] = new int[n];
  System.out.println("Enter array elements:");
  for(int i = 0 ; i <n ; i++)
{
   arr[i] = sc.nextInt();
  System.out.println(arr[i]);
}
System.out.println("Enter the element need to search:");
 int x = sc.nextInt();
 for(int i =0 ; i <n ;i++)
{
if( x == arr[i])
{
System.out.println("Element is found at :"+i);
}
}
}
}
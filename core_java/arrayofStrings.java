import java.util.* ;
public class arrayofStrings{
public static void main(String args[])
{
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt() ;
   System.out.println("Size of array:" +n);
   String str[] = new String[n] ;
   int totLength = 0 ;
   System.out.println("Elements of array:");
   for( int i = 0;i<n;i++)
{
    str[i] = sc.next();
    totLength += str[i].length() ;
 }

  System.out.println(totLength);
}
}
   
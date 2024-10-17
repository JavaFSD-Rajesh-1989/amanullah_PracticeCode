import java.util.* ;
class Fibonacci{
 public static void main(String args[])
{
   int n1 = 0, n2=1;
  System.out.println("Enter count in series:");
  Scanner sc = new Scanner(System.in);
  int count = sc.nextInt() ;
  System.out.print("fibonacci series:"+n1+" "+n2);
  for(int i = 2 ; i < count ; i++)
{
   int next = n1 + n2 ;
   System.out.print(","+next);
   n1 = n2;
   n2= next ;
}
}
}
  
import java.util.* ;
import java.lang.Math.* ;
public class Power{
public static void xandn(int x,int n)
{
   double power = Math.pow(x,n) ;
  System.out.println("Power of x raising n is : "+power);
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
 int x = sc.nextInt() ;
 int n = sc.nextInt();
 xandn(x,n);
}
}

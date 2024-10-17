import java.util.* ;
 public class Functions{
 public static void sumTwo(int a ,int b)
{
  int sum = a + b ;
  System.out.println(sum);
 }
public static void subTwo(int a, int b)
{
  int sub = a - b ;
 System.out.println(sub);
}
public static void mulTwo(int a, int b)
{
  int mul = a * b ;
  System.out.println(mul);
}
public static void divTwo(int a, int b)
{
  int div = a / b ;
  System.out.println(div);
}
public static void main(String args[])
{
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int  b = sc.nextInt();
   sumTwo(a,b);
   subTwo(a,b);
   mulTwo(a,b);
   divTwo(a,b);
   


}
}

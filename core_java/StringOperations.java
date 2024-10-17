import java.util.* ;
public class StringOperations{
  public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 String name1 = sc.nextLine();
 String name2 = sc.nextLine() ;
 String names = name1 + name2 ;
 System.out.println(names);
 System.out.println(names.length());
 for( int i = 0 ; i < names.length() ; i ++)
 {
   System.out.println(names.charAt(i));
 }
 if(name1.compareTo(name2) == 0)
{
   System.out.println("Strings are equal");
}
else
{
  System.out.println("Strings are not equal");
 }
 System.out.println("Substring is : "+names.substring(0,4));
 String number = "123";
 int numbers = Integer.parseInt(number);
 System.out.println(numbers);
 int num = 548 ;
 String str = Integer.toString(num);
 System.out.println(str.length());
}
}


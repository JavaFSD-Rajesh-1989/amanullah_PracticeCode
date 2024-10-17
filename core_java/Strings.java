import java.util.* ;
 public class Strings {
 public static void main (String args[])
{
  Scanner sc = new Scanner(System.in);
  String name = sc.nextLine() ;
  String name2 = sc.nextLine();
  String names = name + "  "  + name2 ;
  System.out.println("Concatenation of two strings are :"+names);
  System.out.println("Total length of two strings are :"+names.length());
  for ( int i =0 ;i<names.length();i++)
  {
       System.out.println(names.charAt(i));

}
 if( name.compareTo(name2)==0)
{
   System.out.println("Strings are equal");
 }
else{
   System.out.println("Strings are not equal");
}
if(new String("Aman")==new String("Aman"))
{
  System.out.println("Strings are equal");
}
else
{
  System.out.println("Strings are not equal");
}
  String substrings = names.substring(1,4);
  System.out.println(substrings);
}
}
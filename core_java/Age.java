import java.Util.* ;
public class AgeofPerson{
 public static void Ageofperson(int age)
{
   if( age >=18)
  {
    System.out.println("Eligible for Voting");
 }
  else if( age <18 )
   {
   System.out.println("Not eligible for Voting");
   }
  else
  {
   System.out.println("Enter Valid age ");
  }
}

 public static void main(String args[])
{
   Scanner sc = new Scanner(System.in) ;
   int age  = sc.nextInt() ;
   Ageofperson(age);
 }
}

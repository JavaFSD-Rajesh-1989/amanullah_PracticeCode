import java.util.* ;
class FirstEvenAndFirstOdd{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter n value:");
 int n = sc.nextInt();
 for(int i = 1 ; i <= 2 * n ; i++)
  { 
 if( i  % 2 == 0){
   System.out.print( i + " " );
  }
}
System.out.println();
for(int j = 1 ; j <= 2 * n ; j++)
  { 
 if( j  % 2 != 0){
   System.out.print( j + " " );
  }

   }

   }
}
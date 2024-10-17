import java.util.* ; 
public class PosandNeg{
  public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
   int countpos = 0 , countneg = 0 , countzero = 0 ;

for( int i=1;i>0;i++)
{
   System.out.println("Enter number :");
    int num = sc.nextInt();
    if(num > 0)
   
      countpos++;
    
  else if(num < 0)
 
    countneg++ ;
 
 else
 
   countzero++ ;
  

System.out.println("Enter 0 to terminate or 1 to continue :");
 int t = sc.nextInt();
 if  (t==0)

 break;
else

continue ;
}
System.out.println("No of positive numbers are :"+countpos);
System.out.println("No of negative numbers are :"+countneg);
System.out.println("No of zeros are :"+countzero);
}
}




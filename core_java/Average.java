import java.util.* ;
public class Average{
  public static float avgofthree(int a,int b ,int c)
{   float avg ; 
    avg =  (a + b + c) / 3 ;
    System.out.println("Avg of three numbers are :" +avg);
    return avg ;
}

public static void main(String args[])
{
   Scanner sc = new Scanner(System.in) ;
   int a = sc.nextInt() ;
   int b = sc.nextInt() ;
   int c = sc.nextInt() ;
   avgofthree(a,b,c);
   
}
}

   
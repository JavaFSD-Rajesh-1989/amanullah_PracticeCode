import java.util.ArrayList ;
import java.util.Collections ;
import java.util.* ;
 class ArrayLists{
public static void main(String args[])
{
  ArrayList<Integer>list =new ArrayList<Integer>() ;
  list.add(10);
  list.add(20);
  list.add(30);
  System.out.println(list);
  System.out.println(list.get(0));
  list.add(1,40);
  System.out.println(list);
  list.set(1,50);
  System.out.println(list);
  System.out.println(list.remove(2));
  System.out.println(list.size());
  for( int i = 0 ; i < list.size() ; i++)
{
   System.out.println(list.get(i));
}
   System.out.println();
   Collections.sort(list) ;
   System.out.println(list);


}
}

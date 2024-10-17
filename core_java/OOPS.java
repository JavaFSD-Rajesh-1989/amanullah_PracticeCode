class Student {
int age ;
String name ;
int  id ;
public void Stddetails()
{

System.out.println(this.age);
System.out.println(this.name);
System.out.println(this.id);
}
}
public class Oopsconcept{
public static void main(String args[])
{
  Student S1 = new Student();
  S1.age = 21 ;
  S1.name = "Amanullah";
  S1.id = 548 ;
  S1.Stddetails() ;
}
}

  
  
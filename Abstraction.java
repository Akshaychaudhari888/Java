package Java;
abstract class calculator
{
  abstract void add(int a,int b);
  abstract void sub(int a,int b);
  abstract void mult(int a,int b);
  abstract void div(int a,int b);
}
class addittion extends calculator
{
  void add(int a,int b)
  {
   System.out.println(a+b);
  }
  public void sub(int a,int b)
  {
   System.out.println(a-b);
  }
  public void mult(int a,int b)
  {
   System.out.println(a*b);
  }
  public void div(int a,int b)
  {
   System.out.println(a/b);
  }
}
public class Abstraction
{
  public static void main(String arg[])
  {
   addittion ob=new addittion();
   ob.add(5,5);
   ob.sub(5,5);
   ob.mult(5,5);
   ob.div(5,5);

  }
}
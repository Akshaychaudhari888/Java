package Java;
//single level inheritance  

  class area
  {
    double circle=3.14*5*5;
    double squre=5*10;
  }
  class circle extends area
  {
    void area()
    {
      System.out.println("Area of circle="+circle);
    }
  }
public class inheritance1
{
  public static void main(String arg[])
  {
   circle ob=new circle();
   ob.area();
  }
}
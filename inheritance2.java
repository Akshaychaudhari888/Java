package Java;
//Multilevel inheritance
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
  class squre extends circle
  {
    void sarea()
    {
    System.out.println("Area of squre="+squre);    
    }
  }
public class inheritance2
{
  public static void main(String arg[])
  {
   circle ob=new circle();
   ob.area();
   squre ob1=new squre();
   ob1.sarea();
  }
}
class getandset
{
    String name;
   private int no;

    void setname(String name)
    {
        this.name=name;
    }
    String getname()
    {
      return this.name;
    }
    void setno(int no)
    {
        this.no=no;
    }
    int getno()
    {
     return this.no;
    }
}
public class getterandsetter
{
    public static void main(String arg[])
    {
    getandset ob=new getandset();
    ob.setname("Akshay");
    System.out.println("Name="+ob.getname());
    ob.setno(1);
    System.out.println("Number="+ob.getno());
    }
}
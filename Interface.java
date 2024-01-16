package Java;
interface calculator
{
    void add();
}
interface calculator1
{
    void sub();
}
class addittion implements calculator,calculator1
{
    public void add()
    {
    System.out.println(10+10);
    }
    public void sub()
    {
        System.out.println(10-5);
    }
}
public class Interface 
{
 public static void main(String arg[])
 {
    addittion ob=new addittion();
    ob.add();
    ob.sub();
 }   
}

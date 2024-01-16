package Java;
//Encapsulation:-1)Getter & Setter  2)Access modifiers.
public class Encapsulation
{
  private String password;

  public void setpassword(String password)
  {
    this.password=password;
  }

  public String getpassword()
  {
     return this.password;
  }
  public static void main(String arg[])
  {
   Encapsulation ob=new Encapsulation();
   ob.setpassword("cvb@123");
   System.out.println(ob.getpassword());
  }
}
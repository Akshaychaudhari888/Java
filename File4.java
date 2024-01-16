//read the file and display line by line reverse order
import java.io.*;
public class File4
{
  public static void main(String arg[])throws Exception
  {
   FileReader f1=new FileReader("abc.txt");
   BufferedReader br=new BufferedReader(f1);
   String s1;
   while((s1=br.readLine())!=null)
   {
    StringBuilder stb=new StringBuilder(s1);
    stb.reverse();
    System.out.println(stb);
   }
   f1.close();
  }
}
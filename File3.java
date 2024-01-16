//Filereader and filewriter
import java.io.*;
public class File3
{
  public static void main(String arg[])throws Exception
  {
    FileReader f1=new FileReader("xyz.txt");
    FileWriter f2=new FileWriter("pqr.txt");
    int ch;
    while((ch=f1.read())!=-1)
    {
      if(Character.isUpperCase(ch))
        f2.write(Character.toLowerCase(ch));
      else if(Character.isLowerCase(ch))
        f2.write(Character.toUpperCase(ch));
      else if(Character.isDigit(ch))
       f2.write('*');
      else
        f2.write(ch);
    }
    f1.close();
    f2.close();
    System.out.println("copy successfully");
  }
}
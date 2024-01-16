import java.io.*;
public class File2
{
  public static void main(String arg[])
  {
    try
    {
     FileInputStream f1=new FileInputStream("abc1.txt");
     int c,d=0,ch=0,sp=0,li=0,sy=0;
     while((c=f1.read())!=-1)
     {
      if(Character.isLetter(c))
        ch++;
      else if(Character.isDigit(c))
        d++;
      else if(c==' ')
      sp++;
      else if(c=='\n')
        li++;
      else
        sy++;
     } 
     System.out.println("character count="+ch);
     System.out.println("digit count="+d);
     System.out.println("symbol counnt="+sy);
     System.out.println("space counnt="+sp);
     System.out.println("Line counnt="+li);
     f1.close();
    }

    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
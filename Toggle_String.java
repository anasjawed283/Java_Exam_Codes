//Read description for question
import java.util.*;
public class Main
{
    public static void main(String...args)
    {
        Scanner sob=new Scanner(System.in);
        String s=sob.nextLine();
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(c[i]>=65 && c[i]<=90)
            {
                c[i]=(char)((int)c[i]+32);
            }
            else if(c[i]==32)
            {
                c[i]=32;
            }
            else
            {
                c[i]=(char)((int)c[i]-32);
            }
        }
        String f="";
        for(int i=0;i<s.length();i++)
        {
            f=f+c[i];
        }
        System.out.println(f);
    }
}

//Read description for question//
import java.util.*;
public class Main
{
    public static void main(String...args)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char[] ch=s.toCharArray();
        int spa=0,spe=0,v=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]>=65 && ch[i]<=90)
            {
                if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
                {
                    v++;
                }
                else
                {
                    c++;
                }
            }
            else if(ch[i]>=97 && ch[i]<=122)
            {
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
                {
                    v++;
                }
                else
                {
                    c++;
                }
            }
            else if(ch[i]==32)
            {
                spa++;
            }
            else
            {
                spe++;
            }
        }
        System.out.println("Vowels: "+v+"\nConsonants: "+c+"\nSpecial Character: "+spe+"\nSpaces: "+spa);
    }
}

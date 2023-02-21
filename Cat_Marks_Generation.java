//Read Description for question
import java.util.*;
class InvalidMarksException extends Exception{
    InvalidMarksException(int m){
        super("Invalid Marks - Marks must be within the range 0 to 30");
    }
}
class CAT{
    String Regno,name;
    int m[]=new int[5];
    
    void readData(Scanner s) throws InvalidMarksException{
        
        Regno=s.next();
        name=s.next();
        for(int i=0;i<5;i++){
        m[i]=s.nextInt();
        if(m[i]<0 || m[i]>30)
        throw new InvalidMarksException(m[i]);}
    }
    void printData(){
        System.out.println("Regno:"+Regno);
        System.out.println("Name:"+name);
        for(int i=0;i<5;i++){
        System.out.println("Mark"+(i+1)+":"+m[i]);
    }}
}
class Main{
    public static void main(String args[]){
        CAT c1=new CAT();
        Scanner s=new Scanner(System.in);
        try{
        c1.readData(s);}
        
        catch(InvalidMarksException e){
            System.out.println(e);
        }
        c1.printData();
}}

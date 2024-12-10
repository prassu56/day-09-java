import java.util.*;
public class Checkuppercaseorlowercase{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        if((s&32)==0)
        System.out.println("Upper Case");
        else
        System.out.println("Lower Case");    
        }
}
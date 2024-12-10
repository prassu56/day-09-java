/*
B giving capital letters as input and printing small letters as output or we can give small letters as input and print caps as output
b
*/
import java.util.*;
public class Togglingacase{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        s^=32;
    System.out.println(s);
    }
    }

package String;
import java.util.*;
public class Palindrome {


public static boolean IsPalidrome(String str){
    int n=str.length();
    for(int i =0;i<str.length()/2;i++){
        if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println("ye palidrome  nahi hai same nhi hai bro ");

            return false;
        }

    }
    System.out.println("ye palidrome hai same hai agge piche ");
    return true;

}
public static void main(String[]args){
String str="krititirk";
System.out.println(IsPalidrome(str));
}}
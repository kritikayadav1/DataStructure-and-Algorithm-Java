package Backtracking;

public class FindSubsets {
    public static void Subsets(String str,int i,StringBuilder current){
        //BASE CASE
        if(i==str.length()){
            System.out.println(current);
        return;
    }
    current.append(str.charAt(i));
    Subsets(str,i+1,current);
current.deleteCharAt(current.length() - 1);
Subsets(str,i+1,current);
    }
 public static void main(String[]args){
String str="abc";
StringBuilder current =new StringBuilder();
        Subsets(str, 0, current);

 }   
}

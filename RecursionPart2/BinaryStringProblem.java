package RecursionPart2;

public class BinaryStringProblem {
    public static void printBinary(int n ,int lastplace ,String str){
if(n==0){
    System.out.println(str);
    return;
}
//place 0
printBinary(n-1, 0, str+"0");

if(lastplace==0){
    printBinary(n-1, 1, str+"1");
}
    }
    public static void main(String[] args) {
        int n =3;
        printBinary(n,0,"");
    }
}

import java.util.*;
public class printLargest {
    public static void printHelloWorld(){
        System.out.println("world ");
        System.out.println("world ");
        System.out.println("world ");
    }
    public static int calculateSum(int num1, int num2){
int sum=num1+num2;
return sum;
    }
    public static void swap(int a,int b){

 int temp=a;
 a=b;
 b=temp;
    
 System.out.println("a: "+a);
 System.out.println("b: "+b);
        }


public static int multiply(int a ,int b){
int product=a*b;
return product;
}
public static int factorial(int n){
    int f=1;
    for(int i=1;i<=n;i++){
f=f*i;
    }
    return f;
}








public static int binCoeff(int n , int r){
    int fact_n=factorial(n);
    int fact_r=factorial(r);
    int fact_nmr=factorial(n-r);
    int binCoeff=fact_n/(fact_r*fact_nmr);
    return binCoeff;
}



public static int sum(int a ,int b,int c){
    return a+b+c;
}
public static int sum(int a,int b){
    return a+b;
}
public static float sum(float a,int b){
    return a+b;
}
public static  boolean isPrime(int n){
for( int i =2;i<=n-1;i++){
   if (n%i==0){
return false;

   }
}
return true;
}

public static void bintToDec(int binNum){
    int myNum = binNum;
    int pow=0;
    int decNum=0;

    while(binNum>0){
        int lastDigit =binNum % 10;
        decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
        pow++;
        binNum=binNum/10;
    }
    System.out.println("decimal of "+myNum+"="+decNum);
}
   public static void main(String[] args) {
bintToDec(101);

}}
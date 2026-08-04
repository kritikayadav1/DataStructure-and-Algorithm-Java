package RecursionPart2;


public class TilingProblem {
    public static int tilingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        int a= tilingProblem(n-1);
        int b=tilingProblem(n-2);
        return a+b;
    }
    public static void main(String[] args){

    int n =10;

    System.out.println(tilingProblem(n));
}
}

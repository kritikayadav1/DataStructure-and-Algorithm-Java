package RecursionPart2;

public class TilingProblem {
    public static int tilingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        int verticalWays= tilingProblem(n-1);
        int horizontalWays=tilingProblem(n-2);
        return verticalWays+horizontalWays;
    }
    public static void main(String[] args){

    int n =10;

    System.out.println(tilingProblem(n));
}
}

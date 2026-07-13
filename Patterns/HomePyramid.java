package Patterns;
public class HomePyramid {
    
   





    public static void main(String[] args) {
    
    int n =5;
 for(int i =1;i<=n;i++){
    //stars
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
// spaces
for( int j=1;j<=2*(n-i);j++){
    System.out.print(" ");
}
// stars
for(int j = 1; j <=i; j++ ){
    System.out.print("*");
}
System.out.println();
 }
for(int i=n;i>=1;i--){
    //stars
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
// spaces
for( int j=1;j<=2*(n-i);j++){
    System.out.print(" ");
}
// stars
for(int j = 1; j <=i; j++ ){
    System.out.print("*");
}
System.out.println();
    

}}}


























// int n =5;
// int a=1;
//         for(int i =1; i<=n;i++){
//             for(  int j=0; j<=i ;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1");
//                 }else{
//                 System.out.print("0");
//             }}
// System.out.println();
//     }}}
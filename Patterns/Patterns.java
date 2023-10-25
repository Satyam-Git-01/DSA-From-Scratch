package Patterns;

public class Patterns {
    public static void main(String[] args) {
        Pattern6(5);
    }

    public static void Pattern1(int n){
        for(int i=0;i<n;i++){
            //System.out.print("* ");
            System.out.println("*");
        }
    }
    public static void Pattern2(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Pattern3(int n){
        for (int row = 0; row < n; row++) {
            for(int col=0;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern4(int n){
        for (int row = 0; row < n; row++) {
            for(int col=0;col<n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern5(int n){
        for (int row = 1; row <= n; row++) {
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void Pattern6(int n){
        for (int row = 0; row <= 2*n-1; row++) {
            int numCol= (row<=n)?row:2*n-row;
            for(int col=0;col<numCol;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

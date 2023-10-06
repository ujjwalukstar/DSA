package Recursion;

public class print1_N {
    public static void inc1ToN(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        inc1ToN(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n=10;
        inc1ToN(n);

    }
}

package Recursion;


public class Factorial {
    static int fact=1;
    public static int fact(int val){
        if(val==1)
        {
           return 1;}
        return val*fact(val-1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial:"+fact(5));
    }

}

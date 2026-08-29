import java.util.*;
// find the binomial coefficient
class Factorial{
    public static int factorial(int n){
        int fact=1;
        for(int i = 1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
        // System.out.println("Factorial of number"+fact);
    }

    public static int binomial(int n ,int r){
        int n_fact = factorial(n);
        int r_fact= factorial(r);
        int rn_fact= factorial(n-r);
        int be=n_fact/(r_fact*rn_fact);
        return be;
    }

    public static void main(String args[]){
        System.out.println(binomial(5,2));
    }
}
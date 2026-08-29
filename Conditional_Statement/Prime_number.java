import java.util.*;
class Prime_number{
    //public static boolean prime(int a){
        // boolean isPrime=true;
        // for(int i = 2;i<=a-1;i++){
        //     if(a%i==0){
        //         isPrime=false;
        //         break;
        //     }
        // }
        //     return isPrime;

        // Optimized Function
        public static boolean isPrime(int a)
        {
            if(a == 2){
                return true;
            }
            for(int i = 2 ; i<=Math.sqrt(a);i++){
                if(a%i==0){
                    return false;
                }
            }
                return true;
        }
        public static void primeInRange(int n){
            for(int i = 2 ; i<=n;i++){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }
            }
             System.out.println();
        }

    //}
    public static void main(String args[]){
        primeInRange(16);
    }
}
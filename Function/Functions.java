import java.util.*;
public class Functions{
    // public static void helloworld(){
    //     System.out.println("Hii! Tanvi");
    // }
    // public static void calculate(){
    //     int a,b;
       //Scanner sc=new Scanner(System.in);
    //     a=sc.nextInt();
    //     b=sc.nextInt();
    //     int res = a+b;
    //     System.out.println("Addition of two number"+res);
        //  fuction with parameters
        //
        // public static int sum(int num1,int num2){// formal parameters
        //     int sum=num1+num2;
        //     return sum;
        // }

        // public static void swap(int n1,int n2){
        //     int temp=n1;
        //     n1=n2;
        //     n2=temp;
        //     System.out.println("value of a = "+n1);
        //     System.out.println("value of b = "+n2);

        // }
        public static int product(int a,int  b){
            int res=a*b;
            return res;
        }


    public static void main(String args[]){
        // helloworld();
        // calculate();
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        // int sum1=sum(a,b);// arguments or actual parameters 
        //  System.out.println("Sum is"+sum1);
        //swap(a,b);
        // int product1=product(5,5);
        // System.out.println("product"+product1);
    }
}
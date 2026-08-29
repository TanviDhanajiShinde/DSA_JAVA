import java.util.*;
class Function_Overloading{
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // public static int sum(int a,int b ,int c){
    //     return a+b+c;
    // }

    // Function overloading by datatypes
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(2,3));
        System.out.println(sum(2.2f,2.8f));
    }
}
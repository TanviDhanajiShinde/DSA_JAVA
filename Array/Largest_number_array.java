import java.util.*;
class Largest_number_array{
    public static int largest_number(int no[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<no.length;i++){
            if(no[i] > largest){
                largest=no[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int number[]={780,99,5,1,78,100};
        int large=largest_number(number);
        System.out.println("Largest number from array "+large);

    }
}
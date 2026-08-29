import java.util.*;
class Pairs_in_Array{
    public static void pair_array(int numbers[]){
        int total_pair=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println("Total pair "+total_pair);
    }
    public static void main(String args[]){
        int array[]={3,9,7,9,7};
        pair_array(array);

    }
}
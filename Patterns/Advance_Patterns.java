import java.util.*;
class Advance_Patterns{
    
        // To print hallow pattern hallow rectangle pattern
        // public static void hallow_pattern(int row,int col)
        // {
        //    for(int i = 1;i<=row;i++)
        //    {
        //     for(int j= 1;j<=col;j++){
        //         if(i==row || i==1|| j==col || j==1){
        //         System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
            
        //     }
        // }

        //Inverted half rotated triangle 
        // public static void inverted_half(int row){
        //     for(int i = 1;i<=row;i++){
        //         for(int j= 1;j<=row-i;j++){
        //             System.out.print(" ");
        //         }
        //         for(int j= 1;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
            
        // }


// Inverted half pyramid pattern with number
        // public static void inverted_half_number(int row){
        //     for(int i =1;i<=row;i++){
        //         for(int j=1;j<=(row-i+1);j++){
        //             System.out.print(j);
        //         }
        //          System.out.println();
        //     }
           
        // }

    //Floyd's Triangle
    public static void floyd_triangle(int row){
        int counter=1;
    for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
    }
    }
        public static void main(String args[]){
           // hallow_pattern(4,5);
           //inverted_half(4);
           //inverted_half_number(5);
           floyd_triangle(5);
        }
    }

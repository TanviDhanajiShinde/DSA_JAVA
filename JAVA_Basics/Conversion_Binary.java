import java.util.*;
class Conversion_Binary{
    // Conversion Binary to decimal 

    // public static void con(int bin_num){
    //     int pow=0;
    //     int dec = 0;
    //     int no=bin_num;
    //     while(bin_num > 0){
    //         int last_digit=bin_num%10;
    //         dec=dec+last_digit*(int)(Math.pow(2,pow));
    //         pow++;
    //         bin_num=bin_num/10;
        
    //     }
    //     System.out.println("Decimal number of "+no+" is "+dec);

    // }

    // Conversion Binary to decimal
    public static void dec_bin(int dec){
        int rem;
        int no = dec;
        int pow = 0;
        int bin = 0;
        while(dec> 0 ){
            rem = dec % 2;
            bin =bin+(rem*(int)Math.pow(10,pow));
            pow++;
            dec=dec/2;
        }
        System.out.println("Decimal no "+no+"binary is "+bin);
    }
    public static void main(String args[]){
    //    con(101);
    //    con(100);
            dec_bin(7);
            dec_bin(12);

    }
}
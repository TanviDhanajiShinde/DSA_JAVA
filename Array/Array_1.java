import java.util.*;
class Array_1{
    public static void update(int mark[]){
        
        for(int i=0;i<mark.length;i++){
            mark[i]=mark[i]+1;
        }

    }
    public static void main(String args[]){
        int number[]=new int[50];
        int number2[]={1,2,3,4};
        String fruits[]={"orange","mango"};

        // Length of array
        
        //System.out.println("Length of fruit array is "+fruits.length);
        
        // Input and output of the array
        
        // int marks[]=new int[30];
        // Scanner sc=new Scanner(System.in);
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();

        // System.out.println("Phy "+marks[0]);
        // System.out.println("chem "+marks[1]);
        // System.out.println("Math "+marks[2]);

        // int percentage=(marks[0]+marks[1]+marks[2])/3;
        // System.out.println("Percentage is "+percentage);

        // Array as function argument
        int marks[]={20,80,80,60};
        int unchangeable=10;
        update(marks);
        for(int i =0;i<marks.length;i++){
            System.out.println(marks[i]);
        }


    }
}
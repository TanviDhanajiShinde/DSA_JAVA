import java.util.*;
public class ConditionalStatement{
    public static void main(String args[]){
        // int age = 10;
        // if ( age >= 18)
        // {
        //     System.out.println("Adult : Drive or vote ");
        // }
        // if( age > 13 && age < 18)
        // {
        //     System.out.println("Teenagers");
        // }
        // else
        // {
        //     System.out.println("Not Adult");
        // }
        
        //Print the largest value of 2 
        Scanner sc = new Scanner(System.in);
    //     
    // 
    // if-if else-else
    // int n =  60;
    // if(n >= 18){
    //     System.out.println("Adult");
    // } 
    // else if ( n >= 13 && n < 18){
    //     System.out.println("Teenagers");
    // }
    // else
    // {
    //     System.out.println("Child");
    // }
// int income,tax;
// income = sc.nextInt();
// if (income <= 500000){
//     System.out.println("No Tax");
// }
// else if (income > 500000 && income <= 1000000 ){
//     tax=(int)(income*0.2);
//     System.out.println("Tax is "+ tax);
// }
// else{
//     tax= (int)(income*0.3);
//     System.out.println("Tax is "+ tax);
// }
// Largest of three numbers
// int a,b,c;
// a = sc.nextInt();
// b = sc.nextInt();
// c = sc.nextInt();
// if (a >= b && a >= c){
//     System.out.println("A is greater no ");
// }
// else if ( b >= a && b >= c){
//     System.out.println("B is greater no");
// }
// else{
//     System.out.println("c is greater no");
// }
// Ternary operators
// int n = 3;
// String type = (n%2==0) ? "even" : "odd";
// System.out.println(type); 
// int result= 30;
// String status =  (result >= 33) ? "Pass" : "Fail";
// System.out.println(status);

//  SWITCH
// int no = 4;
// switch(no){
//     case 1 : System.out.println("Samosa");
//         break;
//     case 2: System.out.println("VadaPav");
//         break;
//     case 3 : System.out.println("momoas");
//         break;
//     default : System.out.println("Wake up");
        
//}

// Calculator 
int a,b;
char ch;
ch = sc.next().charAt(0);
a=sc.nextInt();
b=sc.nextInt();
switch(ch){
    case '+' : 
        System.out.println("Addition"+(a+b));
            break;
    case '-' : 
        System.out.println("Substraction"+(a-b));
            break;
    case '*' : 
        System.out.println("Multiplication"+(a*b));
            break;
    case '/' : 
        System.out.println("Division"+(a/b));
            break;
    default:
        System.out.println("Invalid ");

}
}
 }

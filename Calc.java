// import java.util.*;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args)
    {
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int ans;
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction, 3 for Multiplication 4 for division, and 5 for the Fibonacci Sequence to the First Entry");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(add( num1,num2));
            break;
        case 2:
            System.out.println(sub( num1,num2));
            break;      
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
        case 5:
            System.out.println(fib(num1));
            break;
            
            default:
                System.out.println("Illigal Operation");
        }



    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }
    public static int fib(int x)
    {    
        int n1=0,n2=1,n3=0,i,count=x;     
        System.out.print(n1+" "+n2); // printing 0 and 1   
        for(i=2;i<count;i++) // loop starts from 2 because 0 and 1 are already printed    
        {    
         n3=n1+n2;    
         System.out.print(" "+n3+ " ");    
         n1=n2;    
         n2=n3;
        //  int result = n3;
        
        }
        System.out.print("The last value in the Fib was: "+n3);    
        return n3;
    }

}
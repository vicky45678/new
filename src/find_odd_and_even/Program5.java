package find_odd_and_even;

import java.util.Scanner;

public class Program5 {
     public static void main(String args[]){

         int a;

         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number which one you find here");
         a=sc.nextInt();

         if (a%2==0)
             System.out.println("this is even number");
         else
             System.out.println("this is odd number");

     }
}

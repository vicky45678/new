package swap_two_number_without_using_third_variable;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        int a,b;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        a=sc.nextInt();
        b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("after swapping a "+a);
        System.out.println("after swapping b "+b);
    }
}

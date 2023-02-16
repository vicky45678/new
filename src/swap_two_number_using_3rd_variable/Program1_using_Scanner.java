package swap_two_number_using_3rd_variable;

import java.util.Scanner;

public class Program1_using_Scanner {

    public static void main(String[] args) {

        int a, b, temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before swapping "+a+"\n"+b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping a "+a);
        System.out.println("After swapping b "+b);
    }
}

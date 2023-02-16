package find_largest_number;

import java.util.Scanner;

public class Program3_add_all_number {
    public static void main(String[] args) {

        int a, b, c, d;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number those you need to find out the large number");

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        d=a+b+c;

        if (a>b && a>c)
            System.out.println("first number is larger number than all ="+a);
        else if (b>a && b>c)
            System.out.println("second number is a largest number than  all ="+b);
        else if (c>a && c>b)
            System.out.println("third number is a largest number than all ="+c);
        else
            System.out.println("all number are equal");

        System.out.println("add all number is ="+d);
    }
}

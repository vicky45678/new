package find_largest_number;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        int a,b,c;

        System.out.println("enter 3 number");

        Scanner sc = new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if (a>b && a>c)
            System.out.println("First number is large number "+a);
        else if (b>a && b>c)
            System.out.println("second number is largest number "+b);
        else if (c>b && c>a)
            System.out.println("third number is largest number "+c);
        else
            System.out.println("all number are equal");
    }

}

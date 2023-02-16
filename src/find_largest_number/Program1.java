package find_largest_number;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        int a, b, c;

        System.out.println("enter three integer");
        Scanner sc= new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if (a>b && a>c)
            System.out.println("first number is largest.");

        else if (b>a && b>c)
            System.out.println("second numbebr is largest");

        else if (c>b && c>a)
            System.out.println("third largest number");
        else
            System.out.println("all are equal");



    }
}

package find_largest_number;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        int a,b,c;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number");

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if (a>b && a>c)
            System.out.println("first is largest number");
        else if (b>a && b>c)
            System.out.println("second is largest number");
        else if (c>b && c>a)
            System.out.println("third is largest number");
        else
            System.out.println("all number are equal");
    }
}

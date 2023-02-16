package adding_two_number;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        a=  sc.nextInt();

        System.out.println("enter second number");
        b = sc.nextInt();

        c=a+b;

        System.out.println("after added number is = "+ c);
    }
}

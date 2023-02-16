package adding_two_number;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        a=sc.nextInt();
        b=sc.nextInt();

        c=a+b;
        System.out.println("after edit number"+c);
    }
}

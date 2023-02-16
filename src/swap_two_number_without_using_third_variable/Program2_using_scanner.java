package swap_two_number_without_using_third_variable;

import java.util.Scanner;

public class Program2_using_scanner {

    public static void main(String[] args) {

        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number here");
        a=sc.nextInt();
        b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping value a ="+a);
        System.out.println("After swapping value b ="+b);
    }
}

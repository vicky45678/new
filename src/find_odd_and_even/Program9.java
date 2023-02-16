package find_odd_and_even;

import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number here");
        int a= sc.nextInt();

        if (a%2==0)
            System.out.println("this is even number");
        else
            System.out.println("this is odd number");
    }
}

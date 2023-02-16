package find_odd_and_even;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        a=sc.nextInt();

        if (a%2==0)
            System.out.println("this even number");
        else
            System.out.println("this is not even ");
    }
}

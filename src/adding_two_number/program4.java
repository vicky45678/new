package adding_two_number;

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {

        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number here ");
        a=sc.nextInt();
        b=sc.nextInt();

        c=a+b;

        System.out.println("after added number is =" + c);
    }
}

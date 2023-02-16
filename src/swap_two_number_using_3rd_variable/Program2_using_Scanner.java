package swap_two_number_using_3rd_variable;

import java.util.Scanner;

public class Program2_using_Scanner {

    public static void main(String[] args) {

        int a, b, temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        a=sc.nextInt();
        b=sc.nextInt();

        temp=a;
        a=b;
        b=temp;

        System.out.println("after swaping number a="+a);
        System.out.println("after swaping number b="+b);
    }
}

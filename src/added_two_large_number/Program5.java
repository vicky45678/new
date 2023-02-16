package added_two_large_number;

import java.math.BigInteger;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        String num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        num1= sc.nextLine();

        System.out.println("enter second number");
        num2= sc.nextLine();

        BigInteger first = new BigInteger(num1);
        BigInteger second = new BigInteger(num2);
        BigInteger sum;

        sum=first.add(second);

        System.out.println("after added number ="+ sum);
    }
}

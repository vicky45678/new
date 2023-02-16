package added_two_large_number;

import java.math.BigInteger;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {

        String num1, num2;

        System.out.println("enter two number");
        Scanner sc = new Scanner(System.in);

        num1=sc.nextLine();
        num2=sc.nextLine();

        BigInteger first = new BigInteger(num1);
        BigInteger second = new BigInteger(num2);

        BigInteger sum;

        sum=first.add(second);

        System.out.println("After added this number "+sum);


    }
}

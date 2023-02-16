package added_two_large_number;

import java.math.BigInteger;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        String Num1,Num2;

        Scanner sc= new Scanner(System.in);

        System.out.println("enter first large number");
        Num1=sc.nextLine();

        System.out.println("enter second large number");
        Num2=sc.nextLine();

        BigInteger first = new BigInteger(Num1);
        BigInteger second = new BigInteger(Num2);

        BigInteger sum;

        sum=first.add(second);

        System.out.println("Result of adding number "+sum);

    }
}

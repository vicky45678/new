package input_using_scanner_program;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        String a;
        int b;
        float c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Write here");
        a=sc.nextLine();
        System.out.println("Favorite number "+a);

        System.out.println("enter the number");
        b=sc.nextInt();
        System.out.println("Number is "+ b);

        System.out.println("point value ");
        c= sc.nextFloat();
        System.out.println("point value is "+ c);

    }
}

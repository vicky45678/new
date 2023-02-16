package input_using_scanner_program;

import java.net.Socket;
import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {

        int a;
        float b;
        String c;

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the alphabate");
        c= sc.nextLine();
        System.out.println("Print alphabate"+c);

        System.out.println("Print the number");
        a= sc.nextInt();
        System.out.println("number is "+a);


        System.out.println("Enter the point value");
        b= sc.nextFloat();
        System.out.println("print point value "+ b);

    }
}

package input_using_scanner_program;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        //pass the variable
        String a;
        int b;
        Float c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Print the alphabate");
        a=sc.nextLine();
        System.out.println("the name is "+ a);

        System.out.println("enter the number");
        b=sc.nextInt();
        System.out.println("number is "+ b);

        System.out.println("enter point value");
        c= sc.nextFloat();
        System.out.println("point number is "+c);


    }
}

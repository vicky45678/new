package swap_two_number_using_3rd_variable;

import java.util.Scanner;

public class program3_using_scanner {

    public static void main(String[] args) {

        int a,b, temp;

        Scanner sc = new Scanner( System. in);
        System.out.println(" enter number here ");
        a= sc.nextInt();
        b= sc.nextInt();

        temp=a;
        a=b;
        b=temp;

        System.out.println("after swapping a "+a);
        System.out.println("after swapping b "+b);
    }
}

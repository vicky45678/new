package Integer_print;

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        a=sc.nextInt();

        for (a=0; a<10; a++) {
            System.out.println("Write number " + a);
        }
    }
}

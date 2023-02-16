package convert_fahrenheit_to_celsius;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {

        float temp;

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number here ");
        temp= sc.nextFloat();

        temp=((temp-32)*5)/9;
        System.out.println("this celsius value "+temp);
    }
}

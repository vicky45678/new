package convert_fahrenheit_to_celsius;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {

        float temp;

        System.out.println("enter temperature number");
        Scanner sc = new Scanner(System.in);

        temp=sc.nextFloat();

        temp= ((temp-32)*5)/9;

        System.out.println("this celsious number "+temp);
    }
}

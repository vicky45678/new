package convert_fahrenheit_to_celsius;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        float temperature;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the tempareture value");
        temperature=sc.nextFloat();
        temperature=((temperature-32)*5)/9;
        System.out.println("it is celsius number "+temperature);
    }
}

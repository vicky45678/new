package convert_fahrenheit_to_celsius;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        float temperature;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature fahrenheit");
        temperature=sc.nextFloat();
        temperature=((temperature-32)*5)/9;
        System.out.println("temperature in selsius "+temperature);
    }
}

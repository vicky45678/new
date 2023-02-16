package convert_fahrenheit_to_celsius;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        float temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the temperature value");
        temp=sc.nextFloat();
        temp=((temp-32)*5)/9;
        System.out.println("celcius value is "+temp);
    }
}

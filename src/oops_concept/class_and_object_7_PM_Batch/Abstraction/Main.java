package oops_concept.class_and_object_7_PM_Batch.Abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter car make:");
        String carMake = scanner.nextLine();
        
        System.out.println("Enter car model:");
        String carModel = scanner.nextLine();
        
        System.out.println("Enter car year:");
        int carYear = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter car engine type:");
        String carEngineType = scanner.nextLine();
        
        System.out.println("Enter number of car doors:");
        int carNumDoors = scanner.nextInt();
        
        System.out.println("Does the car have a sunroof? (true/false)");
        boolean carHasSunroof = scanner.nextBoolean();
        
        Car myCar = new Car(carMake, carModel, carYear, carEngineType, carNumDoors, carHasSunroof);
        myCar.start();
        myCar.stop();
        
        System.out.println("Enter motorcycle make:");
        String motorcycleMake = scanner.nextLine();
        
        System.out.println("Enter motorcycle model:");
        String motorcycleModel = scanner.nextLine();
        
        System.out.println("Enter motorcycle year:");
        int motorcycleYear = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter motorcycle engine type:");
        String motorcycleEngineType = scanner.nextLine();
        
        System.out.println("Does the motorcycle have a fairing? (true/false)");
        boolean motorcycleHasFairing = scanner.nextBoolean();
        
        Motorcycle myMotorcycle = new Motorcycle(motorcycleMake, motorcycleModel, motorcycleYear, motorcycleEngineType, motorcycleHasFairing);
        myMotorcycle.start();
        myMotorcycle.stop();
        
        scanner.close();
    }
}

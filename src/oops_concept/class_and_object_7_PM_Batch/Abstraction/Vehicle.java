package oops_concept.class_and_object_7_PM_Batch.Abstraction;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String engineType;
    
    public Vehicle(String make, String model, int year, String engineType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    public String getEngineType() {
        return engineType;
    }
    
    public abstract void start();
    
    public abstract void stop();
}

class Car extends Vehicle {
    private int numDoors;
    private boolean hasSunroof;
    
    public Car(String make, String model, int year, String engineType, int numDoors, boolean hasSunroof) {
        super(make, model, year, engineType);
        this.numDoors = numDoors;
        this.hasSunroof = hasSunroof;
    }
    
    public int getNumDoors() {
        return numDoors;
    }
    
    public boolean hasSunroof() {
        return hasSunroof;
    }
    
    @Override
    public void start() {
        System.out.println("Starting car...");
    }
    
    @Override
    public void stop() {
        System.out.println("Stopping car...");
    }
}

class Motorcycle extends Vehicle {

     boolean hasFairing;
    
    public Motorcycle(String make, String model, int year, String engineType, boolean hasFairing) {
        super(make, model, year, engineType);
        this.hasFairing = hasFairing;
    }
    
    public boolean hasFairing(){
        return hasFairing;
    }
    
    @Override
    public void start() {
        System.out.println("Starting motorcycle...");
    }
    
    @Override
    public void stop() {
        System.out.println("Stopping motorcycle...");
    }
}

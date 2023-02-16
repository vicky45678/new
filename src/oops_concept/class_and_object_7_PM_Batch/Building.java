package oops_concept.class_and_object_7_PM_Batch;

public class Building {

    int numofflat;
    String Name;
    int floor;
    String ownerName;

    public void Apartment(){
        System.out.println("this is created by us ");
    }
    public void showFullDetail(){
        System.out.println("Owner name is"  +ownerName);
        System.out.println("Apartment name is"  +Name);
        System.out.println("there is around"  +numofflat);
        System.out.println("there is totol floor"  +floor);

    }
}

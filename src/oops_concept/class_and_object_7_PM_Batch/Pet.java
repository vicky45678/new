package oops_concept.class_and_object_7_PM_Batch;

public class Pet {

    String typeofpet;
    String petName;
    int petage;
    int vaccination;

    public void animal(){
        System.out.println("I have a dog ");
    }
    public void showFullDetails(){
        System.out.println("Type of pet its dog "+typeofpet);
        System.out.println("My Pet Name is "+petName);
        System.out.println("pet age in year "+petage);
        System.out.println("Its fully vaccinated" +vaccination);
    }
}

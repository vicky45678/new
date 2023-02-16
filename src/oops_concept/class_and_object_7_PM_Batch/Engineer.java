package oops_concept.class_and_object_7_PM_Batch;

public class Engineer {

    int empId;
    String Department;
    String empName;
    String visitingSite;

    public void construction(){
        System.out.println(" this is related construction line");
    }
    public void showFullDetail(){
        System.out.println("generated Id is " +empId);
        System.out.println("Department Name is "+Department);
        System.out.println("Employee Name is " +empName);
        System.out.println("Site for visiting " +visitingSite);
    }
}

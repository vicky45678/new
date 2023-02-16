package oops_concept.class_and_object_7_PM_Batch;

public class Doctor {

    String doctorName;
    String Degree;
    int doctorId;
    String doctorDepartment;

    public void healthCheck(){
        System.out.println("Provided by this doctor");
    }
    public void showFullDetails(){
        System.out.println("Doctor ID is " +doctorId);
        System.out.println("Doctor Name is " +doctorName);
        System.out.println("Degree of Doctor " +Degree);
        System.out.println("Department of Doctor " +doctorDepartment);
    }

}

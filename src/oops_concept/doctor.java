package oops_concept;

public class doctor {

    int doctorId;
    String doctorName;
    String doctorDepartment;

    public void intern()
    {
        System.out.println(doctorName+"doctor studing ");
    }
    public void doctorFullDetails()
    {
        System.out.println("mariij ko dekhta h "+doctorName);
        System.out.println("doctor identity "+doctorId);
        System.out.println("Doctors ka department "+doctorDepartment);
    }
}

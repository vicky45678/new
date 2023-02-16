package oops_concept;

public class doctor_demo {

    public static void main(String[] args) {

        doctor st1;
        st1=new doctor();

        st1.doctorId=122;
        st1.doctorName="Dr rajat sharma ";
        st1.doctorDepartment="neuro surgen";

        st1.intern();
        st1.doctorFullDetails();

    }
}

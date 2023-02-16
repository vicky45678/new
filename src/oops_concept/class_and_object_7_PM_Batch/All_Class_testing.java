package oops_concept.class_and_object_7_PM_Batch;

public class All_Class_testing {

    public static void main(String[] args) {

        //this is the object of building class
        Building st1 = new Building();
        st1.numofflat=500;
        st1.floor=100;
        st1.Name="Vaishali apartment";
        st1.ownerName="Raghvan";

        st1.Apartment();
        st1.showFullDetail();


        //this is the object of college class
        College st2 = new College();
        st2.collegeName="APJ Abdul kalam";
        st2.principle="Vijay laxmi";
        st2.numofteacher=55;
        st2.numofclass=15;

        st2.medicalcollege();
        st2.showFullDetails();


        //this is the object of Doctor class
        Doctor st3 = new Doctor();
        st3.doctorName="Vinay gupta";
        st3.doctorId=123;
        st3.Degree="MBBS";
        st3.doctorDepartment="Neuro surgeon";

        st3.healthCheck();
        st3.showFullDetails();


        //this is the object of Engineer class
        Engineer st4 = new Engineer();
        st4.visitingSite="Urbana Jewels Jaipur";
        st4.Department="Civil engineer";
        st4.empId=101;
        st4.empName="Rahul verma";

        st4.construction();
        st4.showFullDetail();


        //this is the object of pet class
        Pet st5 = new Pet();
        st5.typeofpet="Rottweiler";
        st5.petName="Tiger";
        st5.petage=3;
        st5.vaccination=3;

        st5.animal();
        st5.showFullDetails();


        //this is the object of state class
        State st6 = new State();
        st6.CountryName="INDIA";
        st6.totalState=28;
        st6.Mystate="UTTAR PRADESH";

        st6.country();
        st6.showfulldetails();

    }
}

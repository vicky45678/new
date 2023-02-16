package oops_concept;

public class School_Demo {

    public static void main(String[] args) {

        //first
        School st1;
        st1=new School();

        st1.PrincipleName="Lalita pillai";
        st1.SchoolId=1234;
        st1.SchoolName="Ms school";

        st1.Organization();
        st1.Cbsc();
        st1.showFullDetails();

        //second overloading constructor
        School st2;
        st2=new School(123,"Lalita pillai","ms school");

        st2.Organization();
        st2.showFullDetails();
    }
}

package oops_concept;

public class College_demo {

    public static void main(String[] args) {

        college st1;
        st1 = new college();

        st1.teacherId=12;
        st1.teacherName="Amit kumar";
        st1.teacherSubject="Computer science";
        st1.teacherTiming= 10;

        st1.Identity();
        st1.Name();
        st1.Subject();
        st1.showFullDetails();

        college st2;
        st2 = new college(12);

        st2.teacherId=1234;
        st2.teacherName="gaurav";
        st2.teacherSubject="history";


        st2.Identity();
        st2.Name();
        st2.Subject();
        st2.showFullDetails();

        //2 constructor overloading using parameterized constructor
        college st3;
        st3=new college(12,"rahul","hindi",24);

        st3.Name();
        st3.Identity();
        st3.Subject();
        st3.showFullDetails();

    }
}

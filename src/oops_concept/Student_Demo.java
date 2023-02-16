package oops_concept;

public class Student_Demo {

    public static void main(String[] args) {

        // now creating object of student
        student st1;
        st1=new student();

        st1.studentName="Ram";
        st1.studentId=123;
        st1.studentCity="Agra";

        st1.study();
        st1.showFullDetails();

        //second object
        student st2;
        st2=new student();

        st2.studentId=420;
        st2.studentName="rahul chor ";
        st2.studentCity="chor khandan se";

        st2.study();
        st2.showFullDetails();
    }
}


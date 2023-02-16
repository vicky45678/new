package oops_concept;

public class Myfamily_demo {

    public static void main(String[] args) {

        Myfamily st1;
        st1=new Myfamily();

        st1.PapaName="Babu Ram";
        st1.PapaWork="Constable";
        st1.PapaId=1234;

        st1.Name();
        st1.Work();
        st1.showFullDetails();

        Myfamily st2;
        st2=new Myfamily(123,"Babu ram","on duty");

                st2.showFullDetails();
    }
}

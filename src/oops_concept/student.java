package oops_concept;

public class student {

    // data member : instance variable
    int studentId;
    String studentName;
    String studentCity;

    //Behaviour : member methods : methods : function

    public void  study()
    {
        System.out.println(studentName+"is studying");
    }

    public void showFullDetails()
    {
        System.out.println("my name is "+studentName);
        System.out.println("my id is "+studentId);
        System.out.println("my city is "+studentCity);
    }
}

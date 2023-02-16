package oops_concept;

public class School {

    int SchoolId;
    String SchoolName;
    String PrincipleName;

    //  non parameterized constructor
    public School()
    {
        System.out.println("Creating our organization");
    }

    public School(int i)
    {
        System.out.println(" this is i am ");
    }

    // now i m using parameterized constructor with overloading
    public School(int i, String a, String b)
    {
        SchoolId=i;
        SchoolName=a;
        PrincipleName=b;

        System.out.println("this is our new creation");
    }


    public void Organization()
    {
        System.out.println("this is our organization "+SchoolName);
    }
    public void Cbsc()
    {
        System.out.println("our principle name is "+PrincipleName);
    }
    public void showFullDetails()
    {
        System.out.println("our school id is "+SchoolId);
        System.out.println("our principle name is "+PrincipleName);
        System.out.println("our school name is "+SchoolName);
    }
}

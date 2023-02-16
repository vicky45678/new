package oops_concept;

public class Myfamily {

    int PapaId;
    String PapaName;
    String PapaWork;

    //using constructor
    public Myfamily()
    {
        System.out.println("Creating by me");
    }

    //    Creating a second object with constructor overloading
    public Myfamily(int a, String b, String c)
    {
        PapaId=a;
        PapaName=b;
        PapaWork=c;
        System.out.println(" second using constructor overloading");
    }



    public void Work()
    {
        System.out.println(" he is worked in police department "+PapaWork);
    }
    public void Name()
    {
        System.out.println("my father name is "+PapaName);
    }
    public void showFullDetails()
    {
        System.out.println("officer Id "+PapaId);
        System.out.println("Father name is "+PapaName);
        System.out.println("on duty "+PapaWork);
    }

}

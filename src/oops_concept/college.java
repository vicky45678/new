package oops_concept;

public class college {

    int teacherId;
    String teacherName;
    String teacherSubject;
    float teacherTiming;



    // non parameterized constructor creating
    public college(){
        System.out.println("creating object : non parameterized");
    }

    //1 constructor overloading parameterized constructor
    public college(int st)
    {
        System.out.println("Parameterized constructor : int st");
    }

    //2 constructor overloading
    public college(
            int i, String a, String b,float c)
    {
        teacherId = i;
        teacherName =a;
        teacherSubject=b;
        teacherTiming=c;

    }

    public void Identity()
    {
        System.out.println("Teacher identity "+teacherId);
    }
    public void Name()
    {
        System.out.println("Teacher ka name "+teacherName);
    }
    public void Subject()
    {
        System.out.println("Teaching of subject "+ teacherSubject);
    }
    public void showFullDetails()
    {
        System.out.println("Id number of teacher "+teacherId);
        System.out.println("teacher ka name "+teacherName);
        System.out.println("teacher ka subject "+ teacherSubject);
        System.out.println("teacher ka ane ka time "+teacherTiming);
    }
}

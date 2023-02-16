package oops_concept.class_and_object_7_PM_Batch;

public class State {

    String CountryName;
    int totalState;
    String Mystate;

    public void country(){
        System.out.println("this is my parent country");
    }
    public void showfulldetails(){
        System.out.println("my country is " +CountryName);
        System.out.println("there is total state "+totalState);
        System.out.println("my state is  "+Mystate);
    }
}

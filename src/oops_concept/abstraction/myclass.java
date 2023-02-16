package oops_concept.abstraction;

abstract public class myclass {

    // no abstraction method
    public void cal()
    {
        System.out.println("calculating result");
    }

    //abstract class can not we create object but it take reference from abstract class
    //abstract method (agra apki class main ek bi abstract method ajaega to hame abstract(keyword,class) bnani pdegi)
    abstract public void LaunchRocket();

    abstract public void myfile();
}
class mychild extends myclass{

    public void LaunchRocket()
    {
        System.out.println("my child class is going to launch rocket from nasa");

    }
    public void myfile()
    {
        System.out.println("this is my operating device given by nasa");

    }


}
class test{
    public static void main(String[] args) {

        mychild st1;
        st1=new mychild();

        st1.LaunchRocket();
        st1.cal();
        st1.myfile();
    }
}

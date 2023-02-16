package oops_concept.overriding_exmpl;

public class parent {

    //overridden method
    public void m1()
    {
        System.out.println("m1 of parent");
    }
}
class child extends parent{

    //overriding method child redefine
    public void m1()
    {
        System.out.println(" m1 is my father");

    }
}

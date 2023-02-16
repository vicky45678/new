package oops_concept.overriding_exmpl;

public class Parent1 {

    //overridden method
    public void m1()
    {
        System.out.println("i am the father of my child");
    }
}
class child1 extends Parent1 {

    //overriding method
    public void m1(){
        System.out.println("parent1 is my father");
    }
}
class child2 extends Parent1{

    //overriding
    public void m1()
    {
        System.out.println("they are my parents");
    }
}

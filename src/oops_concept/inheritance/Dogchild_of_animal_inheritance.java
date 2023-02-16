package oops_concept.inheritance;

import oops_concept.inheritance.animal_inheritance;

public class Dogchild_of_animal_inheritance extends animal_inheritance {

    int x= 12;

    public Dogchild_of_animal_inheritance(){

        //first use of
        super();
        System.out.println("work");
        System.out.println("work");

    }

    public void color()
    {
        //second use of
        //refer to parent class
        System.out.println(super.x);
        //refer to child class
        System.out.println(this.x);
    }


}

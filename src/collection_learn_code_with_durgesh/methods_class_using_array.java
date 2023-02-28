package collection_learn_code_with_durgesh;

import java.util.*;

public class methods_class_using_array {

    public void m1(){

        // type safe collection
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(100);
        arr.add(122);
        arr.add(32);
        arr.add(32);
        arr.add(22);
        arr.add(21);
        System.out.println(arr+"add and  :"+arr.size());
        System.out.println(arr+"add and  :"+arr.get(2));
        System.out.println(arr+"add and  :"+arr.get(4));
        System.out.println("_________________________________________________");

        //Un type safe collection
        ArrayList arr1=new ArrayList();
        arr1.add("to the king ofmy life");
        arr1.add(57);
        System.out.println(arr1+"add and  :"+arr1.size());
        System.out.println("_________________________________________________");
    }
    public void m2(){
        HashSet arr=new HashSet();

        arr.add(12);
        arr.add(12);
        arr.add("rohan");
        arr.add(345);

//        System.out.println("this is hashset example:"+arr.);
        System.out.println("this is hashset example:"+arr.remove(1.));
        System.out.println("this is hashset example:"+arr.size());
        System.out.println("this is hashset example:"+arr.getClass());
        System.out.println("_____________________________________________________");
    }

}
class main{
    public static void main(String[] args) {
        methods_class_using_array obj=new methods_class_using_array();
        obj.m1();
        obj.m2();
    }
}

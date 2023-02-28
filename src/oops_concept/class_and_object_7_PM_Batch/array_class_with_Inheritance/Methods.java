package oops_concept.class_and_object_7_PM_Batch.array_class_with_Inheritance;

public class Methods {


    public void MobileBrand(){
        String arr[]={"Samsung","Iphone","Realme","Redme","Xiomi"};


        for (int i=0; i<arr.length; i++)
        {
            System.out.println("Mobile brand name: "+arr[i]);
        }
    }
    public void age(){
        int arr[]={20,21,32,23,43};

        for (int i=0; i<arr.length; i++){
            System.out.println("company employee name :"+arr[i]);
        }

    }
}
class  child extends Methods{

//    public void MobileBrand(){
//                String arr[]={"Mumbai","Pune","thane"};
//
//                for (int i=0; i<arr.length; i++)
//        System.out.println(arr[i]);
//    }
}

class child1 extends child{



}

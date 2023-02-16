package split;

import java.util.Arrays;

public class split {
//
//    public static void main(String[] args) {
//
//    String s1 = "this is the value of my number";
//
//        String s2[] = s1.split("\\s");
//        for (String x:s2)
//            System.out.println(x);


//
//    public static void main(String[] args) {
//       split st1=new split();
//       st1.method1;
//
//    public void method1(){
//        String str = "Apple banana cherry date";
//        String[] fruits = str.split("\\s");
//        for (String x:fruits)
//        System.out.println("fruits: "+x);
//    }

       // st1.method1();

    public void method1(){
        String str = "Apple,banana,cherry,date";
        String[] fruits = str.split(",");
//        System.out.println("fruits");
        for (String fruit: fruits){
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        split st1=new split();
        st1.method1();
    }

}
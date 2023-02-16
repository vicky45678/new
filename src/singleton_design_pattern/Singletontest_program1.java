package singleton_design_pattern;

public class Singletontest_program1 {

    public static void main(String[] args) {

        Testsingleton object1= Testsingleton.getInstance();
        Testsingleton Object2= Testsingleton.getInstance();

        System.out.println(object1.toString());
        System.out.println(Object2.toString());


    }
}
class Testsingleton{

    static Testsingleton Object=new Testsingleton();

    private Testsingleton() {

    }
    public static Testsingleton getInstance(){
        return Object;
    }

}
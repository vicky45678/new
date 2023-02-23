package Using_java8_program.lambda_expresion;

public class Testing_class {
    public static void main(String[] args) {


        //this example of Anonymous class
        Anonymous obj= new Anonymous() {
            @Override
            public void show() {
                System.out.println("hello dear");
            }
        };
        obj.show();


        //this is the example with lambda expression how declare method with lambda
        Anonymous obj1=()->
        {
            System.out.println("hello brother");
        };
        obj1.show();
    }
}

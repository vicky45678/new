package swap_two_number_without_using_third_variable;

public class Program1_without_Scanner {

    public static void main(String[] args) {


        int a=10;
        int b=90;

        System.out.println("before swaping ="+a+"\n"+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("after swaping a ="+a);
        System.out.println("after swaping b ="+b);
    }
}

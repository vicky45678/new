package swap_two_number_using_3rd_variable;

public class Program1 {

    public static void main(String[] args) {

        int a=10;
        int b=20;
        int c;

        c=a;
        a=b;
        b=c;

        System.out.println("after swaping number "+a);
        System.out.println("after swaping number "+b);

    }
}

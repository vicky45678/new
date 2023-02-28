public class swap_number {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("this is a result after swaping :"+a);
        System.out.println("this is b result after swaping :"+b);
    }
}

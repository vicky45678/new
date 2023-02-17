package oops_concept.class_and_object_7_PM_Batch.calulator_app;

import java.util.Scanner;

public class Calculator_testing {

    public static void main(String[] args) {




        System.out.println("enter here number a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter here value  b");
        int b = sc.nextInt();
        System.out.println("enter your choice: 1 for addition, 2 for subtraction, 3 for multiply, 4 for divid, 5 for percentage");
        int choice=sc.nextInt();

        calulator_method_work obj=new calulator_method_work();

        if(choice==1) {
            int result = obj.add(a, b);
            System.out.println("sum result :" + result);
        }
        else if (choice==2){
            int result=obj.subtract(a,b);
            System.out.println("subtract result: "+result);
        }
        else if (choice==3){
            int result= obj.multiply(a,b);
            System.out.println("multiply of this number is :"+result);
        }
        else if (choice==4){
            double result=obj.divide(a,b);
            System.out.println("divide result: "+result);
        }
        else if (choice==5){
            double result=obj.percentage(a,b);
            System.out.println("this is percentage function :"+result);
        }






    }
}

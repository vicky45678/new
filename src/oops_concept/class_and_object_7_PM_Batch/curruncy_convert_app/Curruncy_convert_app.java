package oops_concept.class_and_object_7_PM_Batch.curruncy_convert_app;

import java.util.Scanner;

public class Curruncy_convert_app {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here");
        double a= sc.nextDouble();
        System.out.println("1 for Dollor into indian curuncy," +
                " 2 for indian curruncy into dollor, " +
                "3 for chaina curruncy into Indian rupee, " +
                "4 for Indian curruncy into chaina Yuan," +
                "5 for INR into Pakistan rupee," +
                "6 for Pakistan into INR()Indian rupee ");
        double choice=sc.nextLong();

        Curruncy_convert_Methods obj=new Curruncy_convert_Methods();
        double new1=obj.DollorintoINdian(a);
        double new2=obj.INdianintodollor(a);
        double new3=obj.ChainacurruncyYuanIntoINR(a);
        double new4=obj.INRintoChinaCurruncyYuan(a);
        double new5=obj.INRintoPakistan(a);
        double new6=obj.PakistanintoINR(a);

        if (choice==1){

            System.out.println("Dollor into INR :"+new1);

        }
        else if (choice==2){
            System.out.println("INR Into Dollor :"+new2);

        }
        else if (choice==3){
            System.out.println("Yuan into INR :"+new3);
        }
        else if (choice==4){
            System.out.println("INR into Yuan :" +new4);
        }
        else if (choice==5){
            System.out.println("Indian rupee into pakistan :"+new5);
        }
        else if (choice==6){
            System.out.println("Pakistani rupee into indian rupee :" +new6);
        }



    }
}

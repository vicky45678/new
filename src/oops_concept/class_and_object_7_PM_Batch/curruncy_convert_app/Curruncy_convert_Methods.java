package oops_concept.class_and_object_7_PM_Batch.curruncy_convert_app;

public class Curruncy_convert_Methods {

    public double DollorintoINdian(double a){
        double INR=82.82*a;
        return INR;
    }
    public double INdianintodollor (double a){
        double Dollor=a/82.82;
        return Dollor;

    }
    public double ChainacurruncyYuanIntoINR(double a){
        double INR=12.05*a;
        return INR;
    }
    public double INRintoChinaCurruncyYuan(double a){
        double Yuan=a/12.05;
        return Yuan;
    }
    public double INRintoPakistan(double a){
        double Pakistan=a*3.15;
        return Pakistan;
    }
    public double PakistanintoINR(double a){
        double INR=3.15/a;
        return INR;
    }


}

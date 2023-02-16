package company_work;

public class Methods {

    public void m1(){

    }
    public void m2(){

    }
    public void m3(){

    }
    public void m4(){

    }
    public void m5(){

    }
    public void m6(){

    }
    public void m7(){

    }
    public void m8(){

    }
    public void m9(){

    }
    public void m10(){

    }
    public void m11(){

    }
    public void m12(){

    }
    public void m13(){

    }
    public void m14(){

    }
    public void m15(){

    }
    public void m16(){

    }
    public void m17(){

    }
    public void m18(){

    }
    public void m19(){

    }
    public void m20(){

    }
    public void m21(){

    }
    public void m22(){

    }
    public void m23(){

    }
    public void m24(){

    }
    public void m25(){

    }
    public void m26(){

    }
    public void m27(){

    }
    public void m28(){

    }
    public void m29(){

    }
    public void m30(){

    }
    public void m31(){

    }
    public void m32(){

    }
    public void m33(){

    }
    public void m34(){

    }
    public void m35(){

    }
    public void m36(){

    }
    public void m37(){

    }
    public void m38(){

    }
    public void m39(){

    }
    public void m40(){

    }
    public void m41(){

    }
    public void m42(){

    }
    public void m43(){

    }
    public void m44(){

    }
    public void m45(){

    }
    public void m46(){

    }
    public void m47(){

    }
    public void m48(){

    }
    public void m49(){

    }
    public void m50(){

    }
    public void m51(){

    }
    public void m52(){

    }
    public void m53(){

    }
    public void m54(){

    }
    public void m55(){

    }
    public void m56(){

    }
    public void m57(){

    }
    public void m58(){

    }
    public void m59(){

    }
    public void m60(){

    }
    public void m61(){

    }
    public void m62(){

    }
    public void m63(){

    }
    public void m64(){

    }
    public void m65(){

    }
    public class MethodRunner {
        private Runnable[] methods = new Runnable[50];

        public MethodRunner(Methods myMethods) {
            methods[0] = myMethods::m1;
            methods[1] = myMethods::m2;
            // ...
            methods[49] = myMethods::m50;
        }

        public void runMethods() {
            for (Runnable method : methods) {
                method.run();
            }
        }
    }
    public static void main(String[] args) {
        Methods Methods = new Methods();
//        MethodRunner methodRunner = new MethodRunner(Methods);
//        methodRunner.runMethods();
    }



}

package company_work;

public class MethodGenerator {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("public void method" + i + "() {\n" +
                               "    System.out.println(\"Running Method " + i + "\");\n" +
                               "}\n");
        }
    }
    public void method1() {
        System.out.println("Running Method 1");
    }

    public void method2() {
        System.out.println("Running Method 2");
    }
    // ...
    public void method50() {
        System.out.println("Running Method 50");
    }

}

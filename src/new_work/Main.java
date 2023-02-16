package new_work;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        MethodProcessor processor = new MethodProcessor();
        Method[] methods = Methods.class.getDeclaredMethods();
        processor.processMethods(methods);
    }
}

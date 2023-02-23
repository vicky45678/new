package company_work;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;

public class MainClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Class<?> myClass = Class.forName("MyClass");
        Object myObject = new MyClass();
        
        Method[] methods = myClass.getDeclaredMethods();
        
        for (Method method : methods) {
            if (method.getName().startsWith("method")) {
                try {
                    method.invoke(myObject);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyClass {
    public void method1() {
        System.out.println("MyClass method1 called");
    }
    
    public void method2() {
        System.out.println("MyClass method2 called");
    }
    
    // define more methods here ...
}

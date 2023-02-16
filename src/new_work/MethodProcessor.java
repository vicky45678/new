package new_work;

import java.lang.reflect.Method;

class MethodProcessor {
    public void processMethods(Method[] methods) {
        for (int i = 1; i <= 100; i++) {
            if (i >= 1 && i <= 50) {
                Method method = methods[i-1];
                System.out.println("Processing method 1 to 50: " + method.getName());
                // Do something with the method
            } else if (i >= 51 && i <= 100) {
                Method method = methods[i-1];
                System.out.println("Processing method 51 to 100: " + method.getName());
                // Do something with the method
            }

        }

    }
}

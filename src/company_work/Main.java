package company_work;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {
   public static void main(String[] args) {
      Class cls = YourClassName.class;
      Method[] methods = cls.getDeclaredMethods();
      System.out.println("Methods in class " + cls.getName() + ":");
      for (Method method : methods) {
         System.out.println(" - " + method.getName() + ":");
         System.out.println("   Return Type: " + method.getReturnType().getName());
         System.out.print("   Parameters: ");
         Parameter[] parameters = method.getParameters();
         for (int i = 0; i < parameters.length; i++) {
            System.out.print(parameters[i].getType().getName() + " " + parameters[i].getName());
            if (i < parameters.length - 1) {
               System.out.print(", ");
            }
         }
         System.out.println();
      }
   }
}

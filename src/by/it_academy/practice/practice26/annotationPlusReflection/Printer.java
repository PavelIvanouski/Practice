package by.it_academy.practice.practice26.annotationPlusReflection;

import java.lang.reflect.Field;

public class Printer {

   public static void print(Object obj) {

       Class<?> clazz = obj.getClass();
       Field[] fields = clazz.getDeclaredFields();

       for (Field field : fields) {
           if (field.isAnnotationPresent(Printable.class)) {
               field.setAccessible(true); // enable access to private field
               try {
                   System.out.println(field.getName() + ": " + field.get(obj));
               } catch (IllegalAccessException e) {
                   throw new RuntimeException(e);
               }
           }
       }

   }
}

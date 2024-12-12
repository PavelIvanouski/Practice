package by.it_academy.practice.practice26.annotationPlusReflection2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ObjectValidator {

   public static boolean validate(Object obj) throws IllegalAccessException {

       Class<?> clazz = obj.getClass();
       Field[] fields = clazz.getDeclaredFields();

       for (Field field : fields) {
           field.setAccessible(true); // enable access to private field

           Annotation[] annotations = field.getDeclaredAnnotations();
           for (Annotation annotation : annotations) {
               if (annotation.annotationType() == ValidName.class) {
                   String name = (String) field.get(obj);
                   if (name == null || name.isEmpty()) {
                       return false;
                   }
               } else if (annotation.annotationType() == ValidAge.class) {
                   ValidAge validAge = (ValidAge) annotation;

                   int age = field.getInt(obj);
                   if (age <= validAge.min() || age >= validAge.max()) {
                       return false;
                   }

               }
           }
       }
       return true;
   }
}

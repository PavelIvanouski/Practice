package by.it_academy.practice.practice26.targetExample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface MyAnnotation {
   String stringValue();
   int intValue();
}

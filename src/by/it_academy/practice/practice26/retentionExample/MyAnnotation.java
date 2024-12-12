package by.it_academy.practice.practice26.retentionExample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
   String stringValue();
   int intValue();
}

package by.it_academy.practice.practice26.customAnnotation;

public @interface Version {
   String info();
   int value() default 1;
}

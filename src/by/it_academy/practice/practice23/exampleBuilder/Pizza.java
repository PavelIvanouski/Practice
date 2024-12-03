package by.it_academy.practice.practice23.exampleBuilder;

public class Pizza {

   private String size;
   private String crustType;
   private String topping;

   private Pizza(Builder builder) {
       this.size = builder.size;
       this.crustType = builder.crustType;
       this.topping = builder.topping;
   }

   @Override
   public String toString() {
       return "Pizza{" +
               "size='" + size + '\'' +
               ", crustType='" + crustType + '\'' +
               ", topping='" + topping + '\'' +
               '}';
   }

   public static class Builder {
       private String size;
       private String crustType;
       private String topping;

       public Builder() {
           this.size = "medium";
           this.crustType = "Thin crust";
           this.topping = null;
       }

       public Builder size(String size) {
           this.size = size;
           return this;
       }

       public Builder crustType(String crustType) {
           this.crustType = crustType;
           return this;
       }

       public Builder topping(String topping) {
           this.topping = topping;
           return this;
       }

       public Pizza build() {
           return new Pizza(this);
       }
   }
}

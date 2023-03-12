package org.example;

public class Calculator {

   public static int sum (int x, int y) {
       return x + y;
   }
   public static int sub (int x, int y) {
       return x - y ;
   }
   public static int calculate (String operation, int x, int y) {
       operation = operation.trim();
       switch (operation) {
           case "sum" -> {
               return sum(x, y);
           }
           case "sub" -> {
               return sub(x, y);
           }
           default -> throw new IllegalArgumentException();
       }
   }

}

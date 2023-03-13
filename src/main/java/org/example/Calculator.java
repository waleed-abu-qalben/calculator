package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger(Calculator.class.getName());
    public static int sum (int x, int y) {
       return x + y;
   }
   public static int sub (int x, int y) {
       return x - y ;
   }
   public static int multi (int x, int y) {return x * y ;}
   public static int div (int x, int y) {
        if (y == 0) {
            logger.error("denominator must be greater than 0");
            throw new ArithmeticException("denominator must be greater than 0");
        }
        return x / y;
    }
   public static int calculate (String operation, int x, int y) {

       operation = operation.trim();
       switch (operation) {
           case "sum" :
               logger.info("Summing -> "+x+" + "+y);
               return sum(x, y);
           case "sub" :
               logger.info("Subtraction -> "+x+" - "+y);
               return sub(x, y);
           case "multi" :
               logger.info("Multiplying -> "+x+" * "+y);
               return multi(x, y);
           case "div" :
               logger.info("Dividing -> "+x+" / "+y);
               return div(x, y);

           default : throw new IllegalArgumentException();
       }
   }

}

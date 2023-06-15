package StaticClassesEnumsExceptions;

import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {

        double result = Calculator.calculate(20, 6, Calculator.Type.SUMMARY);
        System.out.println("The result is: " + result);

        result = Calculator.calculate(20, 6, null);
        System.out.println("The result is: " + result);

        result = Calculator.calculate(20, 6, Calculator.Type.SUBTRACTION);
        System.out.println("The result is: " + result);

        result = Calculator.calculate(20, 6, Calculator.Type.MULTIPLICATION);
        System.out.println("The result is: " + result);


    }
}

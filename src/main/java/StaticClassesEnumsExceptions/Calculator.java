package StaticClassesEnumsExceptions;

public class Calculator {

    //    public static final int MULTIPLICATION = 1;
//    public static final int SUMMARY = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBTRACTION = 4;
    public enum Type {
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRACTION
    }

    //Because we have static method, we don't need to create new object in main
    public static double calculate(double a, double b, Type type) {

        double result = 0;
// we can do it with if-else
//        if(type==MULTIPLICATION){
//            return a*b;
//        }
//        return 0;
        try {

            switch (type) {
                case MULTIPLICATION:
                    result = a * b;
                    break;
                case SUMMARY:
                    result = a + b;
                    break;
                case DIVISION:
                    result = a / b;
                    break;
                case SUBTRACTION:
                    result = a - b;
                    break;
                default:
                    result = -1;
            }
        } catch (Exception err) {
            System.out.println("Something bad happened");
        }
        return result;
    }
}

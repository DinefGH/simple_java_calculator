import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        System.out.println( "Please enter first number:" );
//        double x = new java.util.Scanner(System.in).nextDouble();
//        System.out.println( "Please enter operator:" );
//        String operator = new java.util.Scanner(System.in).next();
//        System.out.println( "Please enter second number:" );
//        double y = new java.util.Scanner(System.in).nextDouble();
//
//
//
//
//        switch (operator) {
//            case "+" -> System.out.println(x + y);
//            case "-" -> System.out.println(x - y);
//            case "*", "x" -> System.out.println(x * y);
//            case "/" -> {
//                if (y != 0)
//                    System.out.println(x / y);
//                else System.out.println("I will not try to divide by zero");
//            }
//            default -> System.out.println("Unknown operator" + operator);
//        }
//
//
//    }



        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        double x = scanner.nextDouble();

        System.out.println("Please enter operator (+, -, *, /):");
        String operator = scanner.next();

        System.out.println("Please enter second number:");
        double y = scanner.nextDouble();


        double result = calculate(x, y, operator);
        System.out.println("Result: " + result);

        scanner.close();
    }


    private static double calculate(double x, double y, String operator) {
        return switch (operator) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*", "x" -> x * y;
            case "/" -> (y != 0) ? x / y : Double.NaN;
            default -> {
                System.out.println("Unknown operator: " + operator);
                yield Double.NaN;
            }
        };
    }
}



public class Calculator {
    public static void main(String[] args) {
        System.out.println( "Please enter first number:" );
        double x = new java.util.Scanner(System.in).nextDouble();
        System.out.println( "Please enter operator:" );
        String operator = new java.util.Scanner(System.in).next();
        System.out.println( "Please enter second number:" );
        double y = new java.util.Scanner(System.in).nextDouble();




        switch (operator) {
            case "+" -> System.out.println(x + y);
            case "-" -> System.out.println(x - y);
            case "*", "x" -> System.out.println(x * y);
            case "/" -> {
                if (y != 0)
                    System.out.println(x / y);
                else System.out.println("I will not try to divide by zero");
            }
            default -> System.out.println("Unknown operator" + operator);
        }


    }
}



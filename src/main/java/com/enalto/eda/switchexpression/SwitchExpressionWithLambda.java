package com.enalto.eda.switchexpression;

public class SwitchExpressionWithLambda {
    public static void main(String[] args) {

        var str = "F";

        var result = switch (str) {
            case "A" -> 1;
            case "B" -> 2;
            case "C" -> {
                System.out.println("Testing yield");
                yield 3;
            }
            case "D", "E", "F" -> 4;
            default -> throw new IllegalArgumentException("Unexpected value: " + str);

        };
       System.out.println(result);


        double calculate = calculate(Operator.DIVIDE, 10, 5);
        System.out.println(calculate);
    }

    private static double calculate(Operator operator, double x, double y) {
        return switch (operator) {
            case SUM -> x + y;
            case SUBTRACT -> x - y;
            case MULTIPLY -> x * y;
            case DIVIDE -> {
                if (y == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                yield x / y;
            }
            default -> throw new IllegalArgumentException("Unexpected operator: " + operator);
        };
    }

    enum Operator {
        DIVIDE,
        MULTIPLY,
        SUBTRACT,
        SUM
    }


}

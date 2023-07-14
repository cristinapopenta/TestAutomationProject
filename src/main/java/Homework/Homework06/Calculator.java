package Homework.Homework06;

public class Calculator {
    double compute(double firstParam, double secondParam, String operator)
            throws IllegalArgumentException {
        double result;
        switch (operator) {
            case "+":
                if ((float)(firstParam+secondParam) > Double.MAX_VALUE){
                    throw new IllegalArgumentException("Domain limit exceeded by addition");
                } else {
                    result = firstParam + secondParam;
                }
                break;
            case "-":
                result = firstParam - secondParam;
                break;
            case "*":
                if ((float)(firstParam*secondParam) > Double.MAX_VALUE){
                    throw new IllegalArgumentException("Domain limit exceeded by multiplication");
                } else {
                    result = firstParam * secondParam;
                }
                break;
            case "/":
                if (secondParam == 0) {
                    throw new IllegalArgumentException("Divide by ZERO");
                } else {
                    result = firstParam / secondParam;
                }
                break;
            case "SQRT":
                if (firstParam < 0){
                    throw new IllegalArgumentException("Square root from negative number");
                } else {
                    result = Math.sqrt(firstParam);
                }
                break;
            default: {
                throw new IllegalArgumentException("UNSUPPORTED OPERATOR: " + operator);
            }
        }
        return result;
    }
}

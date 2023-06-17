package Homework.Homework02;

public class Aritmetic {
    public static void main(String[] args){
        if (args.length==3){
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[2]);
            String operator = args[1];
            float result=0;
            switch (operator){
                case("+"): result = a+b; System.out.println("Result of "+ a + operator + b + " = " + result);break;
                //tested with arguments: 5 + 3
                //output: Result of 5.0+3.0=8.0

                case("-"): result = a-b; System.out.println("Result of "+ a + operator + b + " = " + result);break;
                //tested with arguments: 5 - 11
                //output: Result of 5.0-11.0 = -6.0

                case("*"): result = a*b; System.out.println("Result of "+ a + operator + b + " = " + result);break;
                //tested with arguments: 5 * 3
                //output: Result of 5.0*3.0=15.0

                case("/"): result = a/b; System.out.println("Result of "+ a + operator + b + " = " + result);break;
                //tested with arguments: 14 / 5
                //output: Result of 14.0/5.0 = 2.8

                case("%"): result = a%b; System.out.println("Result of "+ a + operator + b + " = " + result);break;
                //tested with arguments: 14 % 5
                //output: Result of 14.0%5.0 = 4.0

                case("^"): result = (float) Math.pow((double) a,(double) b);
                    System.out.println("Result of "+ a + operator + b + "=" + result);break;
                    //tested with arguments: 5 ^ 3
                    //Output: Result of 5.0^3.0=125.0

                default: System.out.println(operator +" is no valid aritmetic operation");
                    //tested with arguments: 5 @ 3
                    //Output: @ is no valid aritmetic operation

            }


        } else {
            System.err.println("3 arguments are needed!!!");
            //Output: 3 arguments are needed!!!
        }

    }
}

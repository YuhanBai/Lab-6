import java.util.Scanner;

public class SciCalculator {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        double result = 0.0;
        double first;
        double second;
        int use = 1;

            while (use != 0) {
                System.out.println("Current Result: " + result);
                System.out.println("Calculator Menu ");
                System.out.println("---------------");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("Enter Menu Selection");

                int Op = calculator.nextInt();

                switch (Op) {
                    case 0:
                        use=Op;
                        System.out.println("Thanks for using this calculator. Goodbye!");
                    break;

                    case 1:
                        System.out.println("Enter first operand:");
                        first = calculator.nextDouble();
                        System.out.println("Enter second operand:");
                        second = calculator.nextDouble();
                        result= first + second;
                    break;

                    case 2:
                        System.out.println("Enter first operand:");
                        first = calculator.nextDouble();
                        System.out.println("Enter second operand:");
                        second = calculator.nextDouble();
                        result = first - second;
                    break;

                    case 3:
                        System.out.println("Enter first operand:");
                        first = calculator.nextDouble();
                        System.out.println("Enter second operand:");
                        second = calculator.nextDouble();
                        result = first * second;
                    break;

                    case 4:
                        System.out.println("Enter first operand:");
                        first = calculator.nextDouble();
                        System.out.println("Enter second operand:");
                        second = calculator.nextDouble();
                        result = first/ second;
                    break;

                    case 5:
                        System.out.println("Enter first operand:");
                        first = calculator.nextDouble();
                        System.out.println("Enter second operand:");
                        second = calculator.nextDouble();
                        result = Math.pow(first, second);
                    break;

                    case 6:
                        System.out.println("Enter first operand:");
                        first = calculator.nextDouble();
                        System.out.println("Enter second operand:");
                        second = calculator.nextDouble();
                        result = Math.log(second)/Math.log(first);
                    break;

                    case 7:
                        //Average//

                    default:
                        System.out.println("Error: Invalid selection!");
                }


            }
        }
    }






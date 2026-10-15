import java.util.Scanner;

public class Question3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        System.out.println("Choose an operation: +, -, *, /");
        char operation = input.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Result: " + (first + second));
                break;
            case '-':
                System.out.println("Result: " + (first - second));
                break;
            case '*':
                System.out.println("Result: " + (first * second));
                break;
            case '/':
                if (second == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (first / second));
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }

        input.close();
    }
}
    

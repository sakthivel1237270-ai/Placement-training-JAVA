import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
    int a = sc.nextInt();
        System.out.println("Enter your second number: ");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("The sum is: " + sum);
    sc.close();
    }
    
}

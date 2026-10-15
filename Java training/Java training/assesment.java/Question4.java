import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume the newline

        System.out.print("Enter department: ");
        String department = input.nextLine();

        System.out.print("Enter email address: ");
        String email = input.nextLine();

        System.out.println("\n--- Student Registration Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);

        input.close();
    }
}

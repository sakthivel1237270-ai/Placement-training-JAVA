import java.util.Scanner;
class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num % 2 == 0 && num > 10) {
            System.out.println("Even and greater than 10");
        } else {
            System.out.println("Condition not satisfied");
        }

        sc.close();
    }
}


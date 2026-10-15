import java.util.Scanner;
 public class Question1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter a username:");
     String username =sc.nextLine();
     System.out.println("Enter a password:");
     String password =sc.nextLine();
 if(username.equals("Sakthivel") && password.equals("abc@123")){
    System.out.println("username and password is correct:");
 }
 else{
    System.out.println("Invalid username or password:");
 }
}
 }
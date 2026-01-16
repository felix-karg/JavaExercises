import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = reader.nextInt();
        System.out.println("Enter a second number: ");
        int y = reader.nextInt();
        reader.close();
        int result = x + y;
        System.out.println(x + " + " + y + " = " + result);
    }
}

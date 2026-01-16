import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = scanner.nextInt();
        System.out.println("Enter number b:");
        int b = scanner.nextInt();
        scanner.close();
        System.out.println("You entered:");
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("Swapping...");
        int proxy = a;
        a = b;
        b = proxy;
        System.out.println("a: " + a + ", b: " + b);
    }
}

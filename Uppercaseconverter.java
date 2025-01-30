import java.util.Scanner;

public class Uppercaseconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Convert to uppercase
        String uppercaseString = input.toUpperCase();
        
        System.out.println("Uppercase version: " + uppercaseString);
        
        scanner.close();
    }
}

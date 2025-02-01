// Java program will pause and wait for the user for their input.
// Once the user presses the enter/return key on their keyboard, the program will continue
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double weight = scanner.nextDouble();
        boolean is_smoker = scanner.nextBoolean();
        System.out.println("Hospital's Medical Form: ");
        System.out.println("User's name: " + name);
        System.out.println("User's name: " + age);
        System.out.println("User's weigth: " + weight);
        System.out.println("Smoker: " + is_smoker);
    }
}

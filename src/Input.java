import java.util.Scanner;
public class Input {
    private static final Scanner scan = new Scanner(System.in);

    public static double getInput() {
        while(true) {
            System.out.print("Please enter a number: ");
            if(scan.hasNextDouble()) {
                return scan.nextDouble();
            } else {
                System.out.println("Invalid input!");
                scan.next();
            }
        }
    }
    public static boolean getBooleanInput() {
        System.out.print("Choice (y/N): ");
        char choice = scan.next().toLowerCase().charAt(0);
        return choice == 'y';
    }
    public static void closeInput() {
        scan.close();
    }
}

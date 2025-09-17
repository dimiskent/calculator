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
    public static void closeInput() {
        scan.close();
    }
}

import java.util.Scanner;
public class Input {
    public static double getInput() {
        Scanner scan = new Scanner(System.in);
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
}

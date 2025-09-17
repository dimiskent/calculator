public class Main {
    public static void main(String[] args) {
        CalcTools Calculator = new CalcTools();
        double num1, num2;
        int choice;
        double result;
        do {
            num1 = Input.getInput();
            num2 = Input.getInput();
            System.out.print("Choose operation from:\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n");
            choice = (int) Input.getInput();
            switch (choice) {
                case 1:
                    // Addition
                    result = Calculator.add(num1, num2);
                    break;
                case 2:
                    // Substraction
                    result = Calculator.sub(num1, num2);
                    break;
                case 3:
                    // Multiplication
                    result = Calculator.mul(num1, num2);
                    break;
                case 4:
                    // Division
                    result = Calculator.div(num1, num2);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid option!");
            }
            System.out.println("Result: " + result);
            System.out.println("Make another calculation?");
        } while(Input.getBooleanInput());
        Input.closeInput();
        System.out.println("Thank you for using my Calculator :D");
    }
}

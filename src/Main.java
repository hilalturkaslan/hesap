import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalculation = "Yes";

        while (continueCalculation.equalsIgnoreCase("Yes")) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = (double) num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Bölme işlemi yapılamaz! İkinci sayı sıfır olamaz.");
                    }
                    break;
                default:
                    System.out.println("Geçersiz operatör! Lütfen +, -, * veya / kullanın.");
                    break;
            }


            System.out.print("Would you like to perform another operation? (Yes/No): ");
            continueCalculation = scanner.next();

            if (continueCalculation.equalsIgnoreCase("No")) {
                break;
            }
        }

        System.out.println("Finish.");
        scanner.close();
    }
}

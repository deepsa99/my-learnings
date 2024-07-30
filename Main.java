import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        System.out.println("Enter a string:");
        sc.nextLine();  // Consume newline left-over
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed string: " + reversed);
    }
}

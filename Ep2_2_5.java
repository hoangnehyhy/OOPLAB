import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ep2_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String num1 = sc.nextLine();
        System.out.print("Enter the second number: ");
        String num2 = sc.nextLine();

        double num01 = Double.parseDouble(num1);
        double num02 = Double.parseDouble(num2);

        if (num02 == 0) {
            System.out.println("Divisor is not possible!");
        } else {
            System.out.println("Sum: " + (num01 + num02));
            System.out.println("Difference: " + (num01 - num02));
            System.out.println("Product: " + (num01 * num02));
            System.out.println("Quotient: " + (num01 / num02));
        }
    }
}
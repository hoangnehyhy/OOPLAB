import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter height of triangle: ");
        num = in.nextInt();
        for(int i = 0;i < num;i++) {
            for(int j = 0; j < num - i - 1;j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < 2 * i + 1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
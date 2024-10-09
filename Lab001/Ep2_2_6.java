import java.util.Scanner;

public class Ep2_2_6 {
    public static void main(String[] args) {
        int option;
        System.out.println("Choose the feature!\n");
        System.out.println("1. Solve linear equation\n");
        System.out.println("2. Solve the system of linear equation\n");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter the first-order factor: ");
                double factor01 = sc.nextDouble();
                System.out.println("Enter the zero order factor: ");
                double factor02 = sc.nextDouble();
                if(factor01 == 0){
                    if(factor02 == 0){
                        System.out.println("The equation has infinitely many solutions\n");
                    }
                    else{
                        System.out.println("The equation has no solutions\n");
                    }
                }
                else{
                    System.out.println("The equation has the solution x = " + (-factor02 / factor01) + "\n");
                }
            case 2:
                System.out.println("Enter the first coefficient of the first equation: ");
                double a11 = sc.nextDouble();
                System.out.println("Enter the second coefficient of the first equation: ");
                double a12 = sc.nextDouble();
                System.out.println("Enter the third coefficient of the first equation: ");
                double a13 = sc.nextDouble();

                System.out.println("Enter the first coefficient of the second equation: ");
                double a21 = sc.nextDouble();
                System.out.println("Enter the second coefficient of the second equation: ");
                double a22 = sc.nextDouble();
                System.out.println("Enter the third coefficient of the second equation: ");
                double a23 = sc.nextDouble();

                double D = (a11 * a22) - (a12 * a21);
                double D1 = (a13 * a22) - (a12 * a23);
                double D2 = (a11 * a23) - (a13 * a21);

                if(D != 0){
                    System.out.println("This system of linear equation has an unique solution! \n");
                    System.out.println("x1 = " + (D1 / D));
                    System.out.println("x2 = " + (D2 / D));
                }
                if(D == 0){
                    if (D1 == 0 && D2 == 0){
                        System.out.println("This system of linear equation has infinitely many solutions!");
                    }
                    if (D1 != 0 || D2 != 0){
                        System.out.println("This system of linear equation has no solution!");
                    }
                }
        }
    }
}


import javax.swing.JOptionPane;
import java.util.Arrays;

public class CheckArray {
    public static int getArraySize() {
        int size = -1;
        while (size <= 0) {
            try {
                String input = JOptionPane.showInputDialog(null, "Enter the size of the array:");
                if (input == null) {
                    JOptionPane.showMessageDialog(null, "Program cancelled.");
                    System.exit(0);
                }
                size = Integer.parseInt(input);
                if (size <= 0) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid size. Please enter a positive integer.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return size;
    }

    public static int[] getArrayElements(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    String input = JOptionPane.showInputDialog(null, "Enter the " + (i + 1) + " element of the array:");
                    if (input == null) {
                        JOptionPane.showMessageDialog(null, "Program cancelled.");
                        System.exit(0);
                    }
                    array[i] = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int size = getArraySize();
        int[] array = getArrayElements(size);

        Arrays.sort(array);
        int sum = Arrays.stream(array).sum();
        double average = (double) sum / size;

        String result = "Sorted Array: " + Arrays.toString(array) +
                "\nSum: " + sum +
                "\nAverage: " + average;

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}

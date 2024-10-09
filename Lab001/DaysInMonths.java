import javax.swing.JOptionPane;

public class DaysInMonths {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getYear() {
        String input;
        int year = -1;

        do {
            input = JOptionPane.showInputDialog(null, "Enter the year:");
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Program cancelled");
                System.exit(0);
            }
            try {
                year = Integer.parseInt(input);
                if (year < 0) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Invalid year. Please enter a valid non-negative number.",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                year = -1;
            }
        } while (year < 0);

        return year;
    }

    public static String getMonth() {
        String[] months = {"January", "Jan", "Jan.", "1", "February", "Feb", "Feb.", "2",
                "March", "Mar", "Mar.", "3", "April", "Apr", "Apr.", "4",
                "May", "5", "June", "Jun", "6", "July", "Jul", "7",
                "August", "Aug", "Aug.", "8", "September", "Sep", "Sept.", "9",
                "October", "Oct", "Oct.", "10", "November", "Nov", "Nov.", "11",
                "December", "Dec", "Dec.", "12"};

        String month;

        do {
            month = JOptionPane.showInputDialog(null, "Enter the month:");

            if (month == null) {
                JOptionPane.showMessageDialog(null, "Program cancelled");
                System.exit(0);
            }

            boolean valid = false;
            for (String validMonth : months) {
                if (validMonth.equalsIgnoreCase(month)) {
                    valid = true;
                    break;
                }
            }

            if (valid) break;

            JOptionPane.showMessageDialog(null,
                    "Invalid month: '" + month + "'. Please enter a valid month (January to December).",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } while (true);

        return month;
    }

    public static int getDaysInMonth(String month, int year) {
        switch (month.toLowerCase()) {
            case "january", "jan", "jan.", "1":
            case "march", "mar", "mar.", "3":
            case "may", "5":
            case "july", "jul", "7":
            case "august", "aug", "aug.", "8":
            case "october", "oct", "oct.", "10":
            case "december", "dec", "dec.", "12":
                return 31;

            case "february", "feb", "feb.", "2":
                return isLeapYear(year) ? 29 : 28;

            case "april", "apr", "apr.", "4":
            case "june", "jun", "6":
            case "september", "sep", "sept.", "9":
            case "november", "nov", "nov.", "11":
                return 30;

            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        int year = getYear();
        String month = getMonth();
        int days = getDaysInMonth(month, year);

        JOptionPane.showMessageDialog(null,
                "Number of days in " + month + " " + year + ": " + days + " days");
    }
}

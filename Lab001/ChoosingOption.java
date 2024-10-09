//import java.util.Scanner;
//import javax.swing.JOptionPane;
//public class ChoosingOption {
//    public static void main(String[] args) {
//        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
//
//        JOptionPane.showMessageDialog(null, "You've chosen: " + (option == javax.swing.JOptionPane.YES_OPTION ? "Yes" : "No"));
//        System.exit(0);
//    }
//}

// ... (import như trên)
//import javax.swing.JOptionPane;
//public class ChoosingOption {
//    public static void main(String[] args) {
//        Object[] options = {"I do", "I don't", "We do"}; // Thay đổi nhãn nút ở đây
//
//        int option = JOptionPane.showOptionDialog(
//                null,
//                "Do you agree to the terms and conditions?",
//                "Confirmation",
//                JOptionPane.DEFAULT_OPTION, // Sử dụng các nút mặc định
//                JOptionPane.QUESTION_MESSAGE,
//                null,
//                options, // Truyền mảng options vào đây
//                options[0]
//        );
//
//        if (option == 0) { // Kiểm tra index của lựa chọn
//            JOptionPane.showMessageDialog(null, "You've chosen: I do");
//        } else if (option == 1) {
//            JOptionPane.showMessageDialog(null, "You've chosen: I don't");
//        } else {
//
//        }
//    }
//}

import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        Object[] options = {"I do", "I don't"};

        int option = JOptionPane.showOptionDialog(
                null,
                "Do you want to change to the first class ticket?",
                "Select option",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );
    if (option == 0){
        JOptionPane.showMessageDialog(null, "You've chosen: "+ options[0]);
        }
    else if (option == 1){
        JOptionPane.showMessageDialog(null, "You've chosen: "+ options[1]);
        }
    }
}
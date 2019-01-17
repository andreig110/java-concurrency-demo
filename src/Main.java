import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Create and set up the window.
        JFrame frame = new JFrame("Java Concurrency Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new JCDPanel());

        // Display the window.
        frame.setSize(640, 480);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

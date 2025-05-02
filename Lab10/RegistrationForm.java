package Lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    private JTextField nameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JLabel nameError, emailError, passwordError, confirmError, successMessage;
    private JButton registerButton;

    public RegistrationForm() {
        setTitle("User Registration");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Components
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passwordLabel = new JLabel("Password:");
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");

        nameField = new JTextField(20);
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);
        confirmPasswordField = new JPasswordField(20);
        registerButton = new JButton("Register");

        nameError = new JLabel();
        emailError = new JLabel();
        passwordError = new JLabel();
        confirmError = new JLabel();
        successMessage = new JLabel();

        nameError.setForeground(Color.RED);
        emailError.setForeground(Color.RED);
        passwordError.setForeground(Color.RED);
        confirmError.setForeground(Color.RED);
        successMessage.setForeground(new Color(0, 128, 0)); // Dark Green

        registerButton.addActionListener(this);

        // Layout
        JPanel panel = new JPanel(new GridLayout(6, 3, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(nameError);

        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(emailError);

        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(passwordError);

        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);
        panel.add(confirmError);

        panel.add(new JLabel());
        panel.add(registerButton);
        panel.add(new JLabel());

        panel.add(successMessage);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Clear previous error messages
        nameError.setText("");
        emailError.setText("");
        passwordError.setText("");
        confirmError.setText("");
        successMessage.setText("");

        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        boolean isValid = true;

        if (name.isEmpty()) {
            nameError.setText("Name is required");
            isValid = false;
        }

        if (email.isEmpty()) {
            emailError.setText("Email is required");
            isValid = false;
        } else if (!email.contains("@")) {
            emailError.setText("Invalid email");
            isValid = false;
        }

        if (password.isEmpty()) {
            passwordError.setText("Password is required");
            isValid = false;
        }

        if (confirmPassword.isEmpty()) {
            confirmError.setText("Confirm Password is required");
            isValid = false;
        } else if (!password.equals(confirmPassword)) {
            confirmError.setText("Passwords do not match");
            isValid = false;
        }

        if (isValid) {
            successMessage.setText("Registration successful!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistrationForm());
    }
}

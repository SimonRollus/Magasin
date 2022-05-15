package userInterface;

import java.awt.*;
import java.awt.event.*;
// Those import may move to SQL files
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class LoginWindow extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel label;
    private JPanel panel;

    public LoginWindow() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 700);
        setResizable(false);
        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);

        JLabel loginLabel = new JLabel("Login");
        loginLabel.setForeground(Color.BLACK);
        loginLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        loginLabel.setBounds(423, 13, 273, 93);
        panel.add(loginLabel);

        textField = new JTextField();
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        textField.setBounds(481, 170, 281, 68);
        textField.setColumns(10);
        panel.add(textField);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        passwordField.setBounds(481, 286, 281, 68);
        panel.add(passwordField);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBackground(Color.BLACK);
        lblUsername.setForeground(Color.BLACK);
        lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblUsername.setBounds(250, 166, 193, 52);
        panel.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setBackground(Color.CYAN);
        lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblPassword.setBounds(250, 286, 193, 52);
        panel.add(lblPassword);

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        loginButton.setBounds(545, 392, 162, 73);
        loginButton.addActionListener(new ActionListener() {

            // this function might go in the SQL part
            public void actionPerformed(ActionEvent loginAction) {
                /*
                String userName = textField.getText();
                String password = passwordField.getText();

                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/magasin",
                            "root",
                            "Mrsimon260??root;):)");

                    PreparedStatement state = (PreparedStatement) connection.prepareStatement("Select name, password from student where name=? and password=?");

                    state.setString(1, userName);
                    state.setString(2, password);
                    ResultSet result = state.executeQuery();
                    if (result.next()) {
                        dispose();
                        MainWindow entryWindow = new MainWindow("stock");
                        JOptionPane.showMessageDialog(loginButton, "You have successfully logged in");
                    } else {
                        JOptionPane.showMessageDialog(loginButton, "Wrong Username & Password");
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
            */
                dispose();
                MainWindow entryWindow = new MainWindow("stock");
            }

        });

        panel.add(loginButton);
    }
}
